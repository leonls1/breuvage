package LLS.Breuvage.controller;

import LLS.Breuvage.model.entity.BasicEntity;
import LLS.Breuvage.service.implement.GService;
import lombok.Getter;
import lombok.NonNull;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Getter
@Validated
public abstract class GController<E extends BasicEntity, ID, Rq, Rs> {
    private final GService<E, ID, Rq, Rs> service;

    public GController(GService<E, ID, Rq, Rs> service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> create(@NonNull  @RequestBody Rq requestDto){
        service.create(requestDto);
        return new ResponseEntity<>("Entity created successfully", HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@NonNull @PathVariable ID id, @RequestBody Rq requestDto){
        service.update(requestDto, id);
        return new ResponseEntity<>("Entity updated", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@NonNull @PathVariable ID id){
        return new ResponseEntity<>(service.findResponseDtoById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Rs> responses = service.findAllResponse();
        return validateNotEmptyList(responses);
    }

    @GetMapping("/not-deleted")
    public ResponseEntity<?> findAllNotDeleted(){
        List<Rs> responses = service.findAllResponseNotDeleted();
        return validateNotEmptyList(responses);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEntityById(@PathVariable @NonNull ID id){
        service.deletedById(id);
        return new ResponseEntity<>("entity deleted", HttpStatus.OK);
    }

    @DeleteMapping("/soft-delete/{id}")
    public ResponseEntity<?> softDeleteById(@NonNull @PathVariable ID id){
        service.sofDeleteById(id);
        return new ResponseEntity<>("entity marked as deleted", HttpStatus.OK);
    }


    protected ResponseEntity<?> validateNotEmptyList(List<?> responseList){
        if(!responseList.isEmpty()){
            return new ResponseEntity<>(responseList, HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

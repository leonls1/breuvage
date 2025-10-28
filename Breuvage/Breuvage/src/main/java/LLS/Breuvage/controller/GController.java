package LLS.Breuvage.controller;

import LLS.Breuvage.model.entity.BasicEntity;
import LLS.Breuvage.service.implement.GService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @Operation(
            summary = "create entity",
            description = "create the entity passed by parameter as a requestDto",
            responses = @ApiResponse(
                    responseCode = "200",
                    description = "entity created successfully"
            )
    )
    @PostMapping
    public ResponseEntity<?> create(@NonNull  @RequestBody Rq requestDto){
        service.create(requestDto);
        return new ResponseEntity<>("Entity created successfully", HttpStatus.CREATED);
    }

    @Operation(
            summary = "update entity",
            description = "find the entity for the given id and update it with the requestDto",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "entity updated successfully"
                    ), @ApiResponse(
                    responseCode = "404",
                    description = "a custom message for the entity indicating that cannot be found"
            )},
            parameters = {
                    @Parameter(name = "id", description = "entity id", required = true),
                    @Parameter(name = "requestDto", description = "entity request", required = true)
            }

    )
    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@NonNull @PathVariable ID id, @RequestBody Rq requestDto){
        service.update(requestDto, id);
        return new ResponseEntity<>("Entity updated", HttpStatus.OK);
    }

    @Operation(
            summary = "find by id",
            description = "find the entity for the given id",
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "an entity for that id in responseDto format"
            ), @ApiResponse(
                    responseCode = "404",
                    description = "a custom message for the entity indicating that cannot be found"
            )},
            parameters = @Parameter(name = "id", description = "entity id", required = true)

    )
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@NonNull @PathVariable ID id){
        return new ResponseEntity<>(service.findResponseDtoById(id), HttpStatus.OK);
    }

    @Operation(
            summary = "find all entities",
            description = "find all entities without any filter",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "a list with entity responses"
                    ), @ApiResponse(
                    responseCode = "204",
                    description = "no content available"
            )}
    )
    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Rs> responses = service.findAllResponse();
        return validateNotEmptyList(responses);
    }

    @Operation(
            summary = "find not deleted",
            description = "find all entities mark as not deleted",
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "a list with entity responses"
            ), @ApiResponse(
                    responseCode = "204",
                    description = "no content available"
            )}
    )
    @GetMapping("/not-deleted")
    public ResponseEntity<?> findAllNotDeleted(){
        List<Rs> responses = service.findAllResponseNotDeleted();
        return validateNotEmptyList(responses);
    }

    @Operation(
            summary = "delete entity",
            description = "delete the entity for the given id",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "entity deleted successfully"
                    ), @ApiResponse(
                    responseCode = "404",
                    description = "a custom message for the entity indicating that cannot be found"
            )},
            parameters = @Parameter(name = "id", description = "entity id", required = true))
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEntityById(@PathVariable @NonNull ID id){
        service.deletedById(id);
        return new ResponseEntity<>("entity deleted", HttpStatus.OK);
    }

    @Operation(
            summary = "soft delete",
            description = "mark the entity as deleted for logical delete",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "entity marked as deleted"
                    ), @ApiResponse(
                    responseCode = "404",
                    description = "a custom message for the entity indicating that cannot be found"
            )},
            parameters = @Parameter(name = "id", description = "entity id", required = true))
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

package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.PurchaseOrderRequestDto;
import LLS.Breuvage.model.dto.response.PurchaseOrderResponseDto;
import LLS.Breuvage.model.entity.PurchaseOrder;
import LLS.Breuvage.model.enums.OrderState;
import LLS.Breuvage.service.IPurchaseOrderService;
import LLS.Breuvage.service.implement.PurchaseOrderServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/purchase")
@RequiredArgsConstructor
@PreAuthorize("hasAnyRole('ADMIN', 'SALES_PERSON')")
public class PurchaseOrderController{

    private final IPurchaseOrderService service;

    @PatchMapping("/{id}")
    public ResponseEntity<?> changePurchaseState(@PathVariable Long id, @RequestBody OrderState state){
        service.changePurchaseState(state, id);
        return ResponseEntity.ok("state changed");
    }

    @PostMapping
    public ResponseEntity<?> createPurchaseOrder(@RequestBody PurchaseOrderRequestDto request){
        service.create(request);
        return ResponseEntity.ok("");
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchases(){
         List<PurchaseOrderResponseDto> responseList = service.findAllResponseNotDeleted();
        if(!responseList.isEmpty()){
            return new ResponseEntity<>(responseList, HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getPurchaseById(@PathVariable Long id){
        return new ResponseEntity<>(service.findResponseDtoById(id) ,HttpStatus.NO_CONTENT);
    }

}

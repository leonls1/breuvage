package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.PaymentRequestDto;
import LLS.Breuvage.service.IPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
    private final IPaymentService service;

    @PostMapping("/init")
    public ResponseEntity<?> initPayment(@RequestBody PaymentRequestDto request){
        service.create(request);
        return new ResponseEntity<>("Payment registered successfully", HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getPaymentById(@PathVariable Long id){
        return new ResponseEntity<>(service.findResponseDtoById(id), HttpStatus.OK);
    }

    @PostMapping("/webhook/mp")
    public ResponseEntity<?> webhookMp(){
        return ResponseEntity.ok("");
    }
}

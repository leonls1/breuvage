package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.PaymentRequestDto;
import LLS.Breuvage.model.dto.response.PaymentResponseDto;
import LLS.Breuvage.model.entity.Payment;
import LLS.Breuvage.repository.PaymentRepository;
import LLS.Breuvage.service.IPaymentService;
import LLS.Breuvage.service.implement.PaymentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController extends GController<Payment, Long, PaymentRequestDto, PaymentResponseDto> {
    @Autowired
    public PaymentController(PaymentServiceImp service){
        super(service);
    }
}

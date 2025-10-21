package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.PaymentNotFoundException;
import LLS.Breuvage.model.dto.request.PaymentRequestDto;
import LLS.Breuvage.model.dto.response.PaymentResponseDto;
import LLS.Breuvage.model.entity.Payment;
import LLS.Breuvage.model.mapper.PaymentMapper;
import LLS.Breuvage.repository.PaymentRepository;
import LLS.Breuvage.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImp extends GService<Payment, Long, PaymentRequestDto, PaymentResponseDto> implements IPaymentService {
        @Autowired
        public PaymentServiceImp (PaymentRepository repository, PaymentMapper mapper){
            super(repository, mapper, new PaymentNotFoundException("there isn't a payment with that id"));
        }
}
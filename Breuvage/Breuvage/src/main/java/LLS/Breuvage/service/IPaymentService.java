package LLS.Breuvage.service;


import LLS.Breuvage.model.dto.request.PaymentRequestDto;
import LLS.Breuvage.model.dto.response.PaymentResponseDto;
import LLS.Breuvage.model.entity.Payment;

public interface IPaymentService extends IGService<Payment, Long, PaymentRequestDto, PaymentResponseDto> {
}

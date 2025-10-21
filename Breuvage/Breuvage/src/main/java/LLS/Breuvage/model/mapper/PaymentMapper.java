package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.PaymentRequestDto;
import LLS.Breuvage.model.dto.response.PaymentResponseDto;
import LLS.Breuvage.model.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper extends GMapper<Payment, PaymentRequestDto, PaymentResponseDto> {
}

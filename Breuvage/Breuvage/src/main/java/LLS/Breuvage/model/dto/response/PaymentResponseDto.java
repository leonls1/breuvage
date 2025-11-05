package LLS.Breuvage.model.dto.response;

import LLS.Breuvage.model.enums.PaymentMethod;
import LLS.Breuvage.model.enums.PaymentState;

import java.math.BigDecimal;

public record PaymentResponseDto(BigDecimal totalAmount, String transactionReference, PaymentMethod method, PaymentState state) {
}

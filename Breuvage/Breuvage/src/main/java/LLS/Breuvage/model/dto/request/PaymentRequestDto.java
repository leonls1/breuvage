package LLS.Breuvage.model.dto.request;

import LLS.Breuvage.model.enums.PaymentMethod;
import LLS.Breuvage.model.enums.PaymentState;

import java.math.BigDecimal;

public record PaymentRequestDto(
        BigDecimal totalAmount,
        String transactionReference,
        PaymentMethod method,
        PaymentState state) {
}
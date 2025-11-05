package LLS.Breuvage.model.dto.request;

import LLS.Breuvage.model.enums.OrderState;
import LLS.Breuvage.model.enums.SalesChannel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PurchaseOrderRequestDto(
        LocalDateTime dateTime,
        OrderState state,
        SalesChannel saleChannel,
        BigDecimal totalAmount,
        Long customerId) {
}

package LLS.Breuvage.model.dto.response;

import LLS.Breuvage.model.enums.OrderState;
import LLS.Breuvage.model.enums.SalesChannel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PurchaseOrderResponseDto(
        LocalDateTime dateTime,
        SalesChannel saleChannel,
        BigDecimal totalAmount,
        OrderState state) {
}

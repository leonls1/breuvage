package LLS.Breuvage.model.dto.request;

import LLS.Breuvage.model.enums.MoventType;

import java.time.LocalDateTime;

public record StockMovementRequestDto(
        int quantity,
        LocalDateTime dateTime,
        String reason,
        Long purchaseOrder,
        Long product,
        MoventType moventType) {
}

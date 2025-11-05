package LLS.Breuvage.model.dto.response;

import LLS.Breuvage.model.enums.MoventType;

import java.time.LocalDateTime;

public record StockMovementResponseDto(int quantity, LocalDateTime dateTime, String reason, Long purchaseOrderId, ProductResponseDto product, MoventType moventType) {
}

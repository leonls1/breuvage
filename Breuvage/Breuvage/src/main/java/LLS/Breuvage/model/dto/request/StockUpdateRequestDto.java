package LLS.Breuvage.model.dto.request;

public record StockUpdateRequestDto(
        StockRequestDto stockRequest,
        StockMovementRequestDto movementRequest) {
}

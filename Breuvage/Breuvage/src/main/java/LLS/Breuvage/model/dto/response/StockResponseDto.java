package LLS.Breuvage.model.dto.response;

public record StockResponseDto(Long actualStock, Long minStock, ProductResponseDto product) {
}

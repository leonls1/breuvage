package LLS.Breuvage.model.dto.request;

import LLS.Breuvage.model.enums.MoventType;

public record StockRequestDto(Long actualStock,
                              Long minStock,
                              Long productId) {
}

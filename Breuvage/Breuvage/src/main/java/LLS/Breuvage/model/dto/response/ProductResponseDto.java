package LLS.Breuvage.model.dto.response;

import java.math.BigDecimal;

public record ProductResponseDto(String name, String description, BigDecimal price, String SKU, Long categoryId, Long stockId) {
}

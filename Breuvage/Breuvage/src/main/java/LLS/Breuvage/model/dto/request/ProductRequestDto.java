package LLS.Breuvage.model.dto.request;

import java.math.BigDecimal;

public record ProductRequestDto(
        String name,
        String description,
        BigDecimal price,
        String SKU,
        Long categoryId) {
}

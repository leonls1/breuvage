package LLS.Breuvage.model.dto.response;

import java.math.BigDecimal;
import java.util.List;

public record ProductCategoryResponseDto(
        String name,
        String description,
        List<Long> products) {
}

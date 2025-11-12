package LLS.Breuvage.model.dto.response;

import java.math.BigDecimal;
import java.util.Date;

public record ZBillResponseDto(
        Date date,
        BigDecimal totalAmountForCurrentDay,
        String FilePDFPath) {
}

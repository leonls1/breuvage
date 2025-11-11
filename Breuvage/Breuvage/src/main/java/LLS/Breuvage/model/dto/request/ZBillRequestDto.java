package LLS.Breuvage.model.dto.request;

import java.math.BigDecimal;
import java.util.Date;

public record ZBillRequestDto(
        Date date,
        BigDecimal totalAmountForCurrentDay,
        String FilePDFPath,
        Long purchaseOrder) {
}

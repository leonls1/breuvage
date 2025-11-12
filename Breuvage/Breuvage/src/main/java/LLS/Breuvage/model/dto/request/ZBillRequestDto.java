package LLS.Breuvage.model.dto.request;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public record ZBillRequestDto(
        Date date,
        BigDecimal totalAmountForCurrentDay,
        String FilePDFPath,
        List<Long> purchaseOrderIds) {
}

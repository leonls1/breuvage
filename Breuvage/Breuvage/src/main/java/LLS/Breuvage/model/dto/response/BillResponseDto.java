package LLS.Breuvage.model.dto.response;

import LLS.Breuvage.model.entity.PurchaseOrder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public record BillResponseDto(Date date, BigDecimal totalAmountForCurrentDay, String FilePDFPath) {
}

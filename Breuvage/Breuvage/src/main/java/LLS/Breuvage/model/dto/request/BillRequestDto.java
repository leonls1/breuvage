package LLS.Breuvage.model.dto.request;

import LLS.Breuvage.model.entity.PurchaseOrder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public record BillRequestDto(Date date, BigDecimal totalAmountForCurrentDay, String FilePDFPath, Long purchaseOrder) {
}

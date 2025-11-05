package LLS.Breuvage.service;

import LLS.Breuvage.model.dto.request.PurchaseOrderRequestDto;
import LLS.Breuvage.model.dto.response.PurchaseOrderResponseDto;
import LLS.Breuvage.model.entity.PurchaseOrder;
import LLS.Breuvage.model.enums.OrderState;

public interface IPurchaseOrderService extends IGService<PurchaseOrder, Long, PurchaseOrderRequestDto, PurchaseOrderResponseDto> {
    void changePurchaseState(OrderState state);
}

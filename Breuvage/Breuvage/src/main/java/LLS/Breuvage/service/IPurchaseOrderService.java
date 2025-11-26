package LLS.Breuvage.service;

import LLS.Breuvage.controller.PurchaseOrderController;
import LLS.Breuvage.model.dto.request.PurchaseOrderRequestDto;
import LLS.Breuvage.model.dto.response.PurchaseOrderResponseDto;
import LLS.Breuvage.model.entity.PurchaseOrder;
import LLS.Breuvage.model.enums.OrderState;
import lombok.NonNull;

public interface IPurchaseOrderService extends IGService<PurchaseOrder, Long, PurchaseOrderRequestDto, PurchaseOrderResponseDto> {
    PurchaseOrderResponseDto changePurchaseState(OrderState state, Long orderStateId);

    void loadState(PurchaseOrder order);

    void createPurchaseOrder(@NonNull PurchaseOrderRequestDto dto);
}

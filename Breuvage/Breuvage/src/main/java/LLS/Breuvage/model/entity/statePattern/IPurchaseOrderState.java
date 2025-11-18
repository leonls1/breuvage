package LLS.Breuvage.model.entity.statePattern;

import LLS.Breuvage.model.entity.PurchaseOrder;

public interface IPurchaseOrderState {
    void cancelOrderByUSer(PurchaseOrder order);
    void cancelOrderDueTimeExceed(PurchaseOrder order);
    void cancelOrderNotCollected(PurchaseOrder order);
    void closeOrder(PurchaseOrder order);
    void deliveredOrder(PurchaseOrder order);
    void orderOutOfStock(PurchaseOrder order);
    void payOrder(PurchaseOrder order);
    void prepareOrder(PurchaseOrder order);
    void orderPending(PurchaseOrder order);
    void orderReadyToDeliver(PurchaseOrder order);
    void orderRejectedPayment(PurchaseOrder order);
    void orderWaitingPayment(PurchaseOrder order);

}

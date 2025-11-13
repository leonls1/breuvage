package LLS.Breuvage.model.entity.statePattern;

import LLS.Breuvage.model.entity.PurchaseOrder;

public class ReadyToDeliver implements IPurchaseOrderState {
    @Override
    public void cancelOrderByUSer(PurchaseOrder order) {

    }

    @Override
    public void cancelOrderDueTimeExceed(PurchaseOrder order) {

    }

    @Override
    public void closeOrder(PurchaseOrder order) {

    }

    @Override
    public void deliverOrder(PurchaseOrder order) {

    }

    @Override
    public void orderOutOfStock(PurchaseOrder order) {

    }

    @Override
    public void orderPayed(PurchaseOrder order) {

    }

    @Override
    public void orderPending(PurchaseOrder order) {

    }

    @Override
    public void orderPrepared(PurchaseOrder order) {

    }

    @Override
    public void orderReadyToDeliver(PurchaseOrder order) {

    }

    @Override
    public void orderRejectedPayment(PurchaseOrder order) {

    }

    @Override
    public void orderWaitingPayment(PurchaseOrder order) {

    }
}

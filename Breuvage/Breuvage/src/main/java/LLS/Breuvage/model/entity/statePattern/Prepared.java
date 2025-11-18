package LLS.Breuvage.model.entity.statePattern;

import LLS.Breuvage.exception.InvalidOrderStateChangeException;
import LLS.Breuvage.model.entity.PurchaseOrder;

public class Prepared implements IPurchaseOrderState {
    @Override
    public void cancelOrderByUSer(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void cancelOrderDueTimeExceed(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void cancelOrderNotCollected(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void closeOrder(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void deliveredOrder(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void orderOutOfStock(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void payOrder(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void orderPending(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void orderReadyToDeliver(PurchaseOrder order) {
        /// ///
    }

    @Override
    public void prepareOrder(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is already being prepared, request denied");
    }

    @Override
    public void orderRejectedPayment(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }

    @Override
    public void orderWaitingPayment(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order is being prepared, request denied");
    }
}

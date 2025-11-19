package LLS.Breuvage.model.entity.statePattern.purchaseOrder;

import LLS.Breuvage.exception.InvalidOrderStateChangeException;
import LLS.Breuvage.model.entity.PurchaseOrder;

public class Pending implements IPurchaseOrderState {
    @Override
    public void cancelOrderByUSer(PurchaseOrder order) {
        /// ///
    }

    @Override
    public void cancelOrderDueTimeExceed(PurchaseOrder order) {
    /// ///
    }

    @Override
    public void cancelOrderNotCollected(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order isn't ready, request denied");
    }

    @Override
    public void closeOrder(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order isn't ready, request denied");
    }

    @Override
    public void deliveredOrder(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order isn't ready, request denied");
    }

    @Override
    public void orderOutOfStock(PurchaseOrder order) {
        /// /////////////
    }

    @Override
    public void payOrder(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order isn't ready, request denied");
    }

    @Override
    public void orderPending(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order isn't ready, request denied");
    }

    @Override
    public void orderReadyToDeliver(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order isn't ready, request denied");
    }

    @Override
    public void prepareOrder(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order isn't ready, request denied");
    }


    @Override
    public void orderRejectedPayment(PurchaseOrder order) {
        throw new InvalidOrderStateChangeException("The order isn't ready, request denied");
    }

    @Override
    public void orderWaitingPayment(PurchaseOrder order) {
        /// /////////////
    }
}

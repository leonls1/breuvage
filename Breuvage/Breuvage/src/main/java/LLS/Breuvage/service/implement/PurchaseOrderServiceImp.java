package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.InvalidOrderStateChangeException;
import LLS.Breuvage.exception.PurchaseOrderNotFoundException;
import LLS.Breuvage.model.dto.request.PurchaseOrderRequestDto;
import LLS.Breuvage.model.dto.response.PurchaseOrderResponseDto;
import LLS.Breuvage.model.entity.PurchaseOrder;
import LLS.Breuvage.model.entity.statePattern.purchaseOrder.*;
import LLS.Breuvage.model.enums.OrderState;
import LLS.Breuvage.model.mapper.PurchaseOrderMapper;
import LLS.Breuvage.repository.PurchaseOrderRepository;
import LLS.Breuvage.service.IPurchaseOrderService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PurchaseOrderServiceImp extends GService<PurchaseOrder, Long, PurchaseOrderRequestDto, PurchaseOrderResponseDto> implements IPurchaseOrderService {
    private final Map<OrderState, IPurchaseOrderState> stateMap = new HashMap<>();

    public PurchaseOrderServiceImp(PurchaseOrderRepository repository, PurchaseOrderMapper mapper) {
        super(repository, mapper, new PurchaseOrderNotFoundException("There isn't a purchase with that id"));
        stateMap.put(OrderState.CLOSED, new Closed());
        stateMap.put(OrderState.CANCELLED_BY_USER, new CancelledByUser());
        stateMap.put(OrderState.CANCELLED_DUE_TIME_EXCEEDED, new CancelledDueTimeExceeded());
        stateMap.put(OrderState.DELIVERED, new Delivered());
        stateMap.put(OrderState.ORDER_NOT_COLLECTED, new NotCollected());
        stateMap.put(OrderState.OUT_OF_STOCK, new OutOfStock());
        stateMap.put(OrderState.PAYED, new Payed());
        stateMap.put(OrderState.PENDING, new Pending());
        stateMap.put(OrderState.PREPARED, new Prepared());
        stateMap.put(OrderState.READY_TO_DELIVER, new ReadyToDeliver());
        stateMap.put(OrderState.REJECTED_PAYMENT, new RejectedPayment());
        stateMap.put(OrderState.WAITING_PAYMENT, new WaitingPayment());
    }
    @Override
    public PurchaseOrderResponseDto changePurchaseState(OrderState state, Long orderStateId) {
        PurchaseOrder order = super.findEntityById(orderStateId);
        loadState(order);

        try {
            switch (state) {
                case CANCELLED_BY_USER -> {
                    order.cancelOrderByUSer();
                }
                case CANCELLED_DUE_TIME_EXCEEDED -> {
                    order.cancelOrderDueTimeExceed();
                }
                case CLOSED -> {
                    order.closeOrder();
                }
                case DELIVERED -> {
                    order.deliverOrder();
                }
                case ORDER_NOT_COLLECTED -> {
                    order.cancelOrderNotCollected();
                }
                case OUT_OF_STOCK -> {
                    order.orderOutOfStock();
                }
                case PAYED -> {
                    order.orderPayed();
                }
                case PENDING -> {
                    order.orderPending();
                }
                case PREPARED -> {
                    order.orderPrepared();
                }
                case READY_TO_DELIVER -> {
                    order.orderReadyToDeliver();
                }
                case REJECTED_PAYMENT -> {
                    order.orderRejectedPayment();
                }
                case WAITING_PAYMENT -> {
                    order.orderWaitingPayment();
                }
            }

        } catch (InvalidOrderStateChangeException iosce) {
            throw new InvalidOrderStateChangeException(iosce.getMessage());
        }
        order.setState(state);
        super.getRepository().save(order);

        return super.getMapper().toDto(order);
    }

    @Override
    public void loadState(PurchaseOrder order) {
        order.setOrderState(
                stateMap.get(order.getState()));
    }

    @Override
    public void createPurchaseOrder(@NonNull PurchaseOrderRequestDto dto) {
        PurchaseOrder order = super.getMapper().toEntity(dto);
        order.setState(OrderState.PENDING);
        super.getRepository().save(order);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;


import LLS.Breuvage.model.entity.statePattern.*;
import LLS.Breuvage.model.enums.OrderState;
import LLS.Breuvage.model.enums.SalesChannel;
import LLS.Breuvage.service.IPurchaseOrderService;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author leon
 */
@Getter
@Setter
@Entity
public class PurchaseOrder extends BasicEntity{
    private LocalDateTime dateTime;
    
    @Enumerated(value = EnumType.STRING)
    private SalesChannel saleChannel;
    
    private BigDecimal totalAmount;
    
    @Enumerated(value = EnumType.STRING)
    private OrderState state = OrderState.PENDING;
    
    @OneToMany(mappedBy = "purchaseOrder")
    private List<PurchaseOrderDetail> details;
    
    @OneToMany(mappedBy = "purchaseOrder")
    private List<Message> messages;

    @ManyToOne
    private Customer customer;

    @Transient
    private IPurchaseOrderState orderState = new Pending();

    //--------------------------state pattern applied---------------------------------
    public void cancelOrderByUSer(){
        orderState.cancelOrderByUSer(this);
    }
    public void cancelOrderDueTimeExceed(){
        orderState.cancelOrderDueTimeExceed(this);
    }
    public void closeOrder(){
        orderState.closeOrder(this);
    }
    public void deliverOrder(){
        orderState.deliverOrder(this);
    }
    public void orderOutOfStock(){
        orderState.orderOutOfStock(this);
    }
    public void orderPayed(){
        orderState.orderPayed(this);
    }
    public void orderPending(){
        orderState.orderPending(this);
    }
    public void orderPrepared(){
        orderState.orderPrepared(this);
    }
    public void orderReadyToDeliver(){
        orderState.orderReadyToDeliver(this);
    }
    public void orderRejectedPayment(){
        orderState.orderRejectedPayment(this);
    }
    public void orderWaitingPayment(){
        orderState.orderWaitingPayment(this);
    }

    //--------------------------starting orderState with state from db---------------
    public void loadState(){
        switch (this.getState()){
            case CANCELLED_BY_USER -> {
                this.setOrderState(new CancelledByUser());
            }
            case CANCELLED_DUE_TIME_EXCEEDED -> {
                this.setOrderState(new CancelledDueTimeExceeded());
            }
            case  CLOSED -> {
                this.setOrderState(new Closed());
            }
            case DELIVERED -> {
                this.setOrderState(new Delivered());
            }
            case NOT_RETIRED -> {
                this.setOrderState(new NotRetired());
            }
            case OUT_OF_STOCK -> {
                this.setOrderState(new OutOfStock());
            }
            case PAYED -> {
                this.setOrderState(new Payed());
            }
            case PENDING -> {
                this.setOrderState(new Pending());
            }
            case PREPARED ->{
                this.setOrderState(new Prepared());
            }
            case READY_TO_DELIVER -> {
                this.setOrderState(new ReadyToDeliver());
            }
            case REJECTED_PAYMENT -> {
                this.setOrderState(new RejectedPayment());
            }
            case WAITING_PAYMENT -> {
                this.setOrderState(new WaitingPayment());
            }

        }
    }



}

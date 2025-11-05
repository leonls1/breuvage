/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;


import LLS.Breuvage.model.enums.OrderState;
import LLS.Breuvage.model.enums.SalesChannel;
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
    private OrderState state = OrderState.EXPECTING;
    
    @OneToMany(mappedBy = "purchaseOrder")
    private List<PurchaseOrderDetail> details;
    
    @OneToMany(mappedBy = "purchaseOrder")
    private List<Message> messages;

    @ManyToOne
    private Customer customer;
}

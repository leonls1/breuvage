/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import com.LLL.Breuvage.model.enums.OrderState;
import com.LLL.Breuvage.model.enums.SalesChannel;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author leon
 */
@Getter
@Setter
@Entity
public class Order extends BasicEntity{
    private LocalDateTime dateTime;
    
    @Enumerated(value = EnumType.STRING)
    private SalesChannel saleChannel;
    
    private BigDecimal totalAmount;
    
    @Enumerated(value = EnumType.STRING)
    private OrderState state;
    
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> details;
    
    @OneToMany(mappedBy = "order")
    private List<Message> messages;
}

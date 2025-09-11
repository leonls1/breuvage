/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author leon
 */
@Getter
@Setter
@Entity
public class OrderDetail extends BasicEntity{
    
    @ManyToOne
    private Product product;
    @ManyToOne
    private Order order;
    private BigDecimal unityAmount;
    private int quantity;
    private BigDecimal subTotal;
    
}

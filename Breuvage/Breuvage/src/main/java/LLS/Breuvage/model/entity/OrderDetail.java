/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

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
    private PurchaseOrder purchaseOrder;
    private BigDecimal unityAmount;
    private int quantity;
    private BigDecimal subTotal;
    
}

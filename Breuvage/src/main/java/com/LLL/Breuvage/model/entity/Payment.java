/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import com.LLL.Breuvage.model.enums.PaymentMethod;
import com.LLL.Breuvage.model.enums.PaymentState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
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
public class Payment extends BasicEntity{
    private BigDecimal totalAmount;
    
    private String transactionReference;
    
    @Enumerated(value = EnumType.STRING)
    private PaymentMethod method;
    
    @Enumerated(value = EnumType.STRING)
    private PaymentState state;
    
    @OneToMany(mappedBy = "payment")
    private List<ExternalIntegration> integrations;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;


import LLS.Breuvage.model.enums.PaymentMethod;
import LLS.Breuvage.model.enums.PaymentState;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

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

    @OneToOne
    private ZBill bill;
}

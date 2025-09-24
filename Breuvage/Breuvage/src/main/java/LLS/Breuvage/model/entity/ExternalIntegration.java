/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;


import LLS.Breuvage.model.enums.SyncState;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 *
 * @author leon
 */
@Getter 
@Setter
@Entity
public class ExternalIntegration extends BasicEntity{
    private LocalDateTime lastTry;
    
    @OneToOne
    private PurchaseOrder purchaseOrder;
    
    @ManyToOne
    private Payment  payment;
    
    @Enumerated(value = EnumType.STRING)
    private SyncState syncState;
    
    
    
    
}

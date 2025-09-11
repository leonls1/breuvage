/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import com.LLL.Breuvage.model.enums.SyncState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

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
    private Order order;
    
    @ManyToOne
    private Payment  payent;
    
    @Enumerated(value = EnumType.STRING)
    private SyncState syncState;
    
    
    
    
}

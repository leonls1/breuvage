/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import com.LLL.Breuvage.model.enums.MoventType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
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
public class StockMovent extends BasicEntity{    
    private Long quantity;
    private LocalDateTime dateTime;
    private String reason;
    
    @ManyToOne
    private User user;
    
    @ManyToOne
    private Order order;
    
    @ManyToOne
    private Product product;
    
    @Enumerated(value = EnumType.STRING)
    private MoventType moventType;
    
}

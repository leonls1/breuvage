/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author leon
 */
@Entity
@Getter
@Setter
public class Bill extends BasicEntity{
    private Date date;
    
    private BigDecimal totalAmountForCurrentDay;   
    
    private String FilePDFPath;   
        
    @ManyToMany
    private Order order;   
    
}

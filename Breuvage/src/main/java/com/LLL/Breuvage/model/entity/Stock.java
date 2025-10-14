/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author leon
 */
@Getter
@Setter
@Entity
public class Stock extends BasicEntity{
    private Long actualStock;
    private Long minStock;
    
    @OneToOne
    private Product product;
    
}

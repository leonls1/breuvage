/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Product extends BasicEntity{
    private String name;
    private String description;
    private BigDecimal price;
    private boolean isActive = true;
    private String SKU;
    
    @ManyToOne
    private ProductCategory category;
    
    @OneToOne(mappedBy = "product") 
    private Stock stock;
    
    @OneToMany(mappedBy = "product")
    private List<StockMovent>  movements;
    
    
    
            
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class ZBill extends BasicEntity{
    private Date date;
    
    private BigDecimal totalAmountForCurrentDay;   
    
    private String FilePDFPath;   
        
    @ManyToMany
    private List<PurchaseOrder> purchaseOrder;
    
}

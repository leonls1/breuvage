package LLS.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 *
 * @author leon
 */
@Getter
@Setter
@Entity
public class PurchaseOrderDetail extends BasicEntity{
    
    @ManyToOne
    private Product product;
    @ManyToOne
    private PurchaseOrder purchaseOrder;
    private BigDecimal unityCostAmount;
    private int quantity;
    private BigDecimal subTotal;
    
}

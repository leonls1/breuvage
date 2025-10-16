package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.PurchaseOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository extends GRepository<PurchaseOrder, Long> {
}

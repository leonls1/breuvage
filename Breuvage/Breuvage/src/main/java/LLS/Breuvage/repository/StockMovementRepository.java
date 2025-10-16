package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.StockMovent;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMovementRepository extends GRepository<StockMovent, Long> {
}

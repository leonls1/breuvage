package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.Bill;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends GRepository<Bill, Long>{
}

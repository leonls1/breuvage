package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.ZBill;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends GRepository<ZBill, Long>{
}

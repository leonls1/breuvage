package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends GRepository<Customer, Long>{
}

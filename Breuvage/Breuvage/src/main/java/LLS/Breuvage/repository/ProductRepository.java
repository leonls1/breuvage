package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends GRepository<Product,Long>{
}

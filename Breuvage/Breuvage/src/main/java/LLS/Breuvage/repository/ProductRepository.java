package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.Product;
import LLS.Breuvage.model.entity.ProductCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends GRepository<Product,Long>{
    List<Product> findByName(String name);

    List<Product> findByCategory(ProductCategory category);
}

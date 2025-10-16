package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.ProductCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends GRepository<ProductCategory, Long> {
}

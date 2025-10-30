package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.ProductCategory;
import jdk.jfr.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends GRepository<ProductCategory, Long> {
    List<ProductCategory> findCategoriesByName(String Name);
}

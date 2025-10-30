package LLS.Breuvage.service;

import LLS.Breuvage.model.entity.Product;
import LLS.Breuvage.model.entity.ProductCategory;
import jdk.jfr.Category;

import java.util.List;

public interface IProductService {
    List<Product> findByName(String productName);

    List<Product> findByCategory(ProductCategory category);
}

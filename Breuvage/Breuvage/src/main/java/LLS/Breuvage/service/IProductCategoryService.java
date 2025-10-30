package LLS.Breuvage.service;

import LLS.Breuvage.model.entity.ProductCategory;

import java.util.List;

public interface IProductCategoryService {
    List<ProductCategory> findByName(String name);


}

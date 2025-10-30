package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.ProductCategoryRequestDto;
import LLS.Breuvage.model.dto.response.ProductCategoryResponseDto;
import LLS.Breuvage.model.entity.ProductCategory;
import LLS.Breuvage.service.implement.ProductCategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product-category")
public class ProductCategoryController extends GController<ProductCategory, Long, ProductCategoryRequestDto, ProductCategoryResponseDto> {
    @Autowired
    public ProductCategoryController(ProductCategoryServiceImp service){
        super(service);
    }

}

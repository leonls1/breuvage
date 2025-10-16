package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.ProductCategoryNotFoundException;
import LLS.Breuvage.model.dto.request.ProductCategoryRequestDto;
import LLS.Breuvage.model.dto.response.ProductCategoryResponseDto;
import LLS.Breuvage.model.entity.ProductCategory;
import LLS.Breuvage.model.mapper.ProductCategoryMapper;
import LLS.Breuvage.model.mapper.ProductMapper;
import LLS.Breuvage.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryImp extends GService<ProductCategory, Long, ProductCategoryRequestDto, ProductCategoryResponseDto> {
    @Autowired
    public ProductCategoryImp(ProductCategoryRepository repository, ProductCategoryMapper mapper){
        super(repository, mapper, new ProductCategoryNotFoundException("There isn't a category with that id"));
    }
}

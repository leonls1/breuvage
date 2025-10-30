package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.ProductCategoryNotFoundException;
import LLS.Breuvage.model.dto.request.ProductCategoryRequestDto;
import LLS.Breuvage.model.dto.response.ProductCategoryResponseDto;
import LLS.Breuvage.model.entity.ProductCategory;
import LLS.Breuvage.model.mapper.ProductCategoryMapper;
import LLS.Breuvage.repository.ProductCategoryRepository;
import LLS.Breuvage.service.IProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImp extends GService<ProductCategory, Long, ProductCategoryRequestDto, ProductCategoryResponseDto> implements IProductCategoryService {
    @Autowired
    public ProductCategoryServiceImp(ProductCategoryRepository repository, ProductCategoryMapper mapper){
        super(repository, mapper, new ProductCategoryNotFoundException("There isn't a category with that id"));
    }

    @Override
    public List<ProductCategory> findByName(String name) {
       return  ((ProductCategoryRepository) super.getRepository()).findCategoriesByName(name);
    }


}

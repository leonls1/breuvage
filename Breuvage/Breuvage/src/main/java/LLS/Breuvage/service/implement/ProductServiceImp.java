package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.ProductNotFoundException;
import LLS.Breuvage.model.dto.request.ProductRequestDto;
import LLS.Breuvage.model.dto.response.ProductResponseDto;
import LLS.Breuvage.model.entity.Product;
import LLS.Breuvage.model.entity.ProductCategory;
import LLS.Breuvage.model.mapper.ProductMapper;
import LLS.Breuvage.repository.ProductCategoryRepository;
import LLS.Breuvage.repository.ProductRepository;
import LLS.Breuvage.service.IProductCategoryService;
import LLS.Breuvage.service.IProductService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DependsOn({"productRepository"})
public class ProductServiceImp extends GService<Product, Long, ProductRequestDto, ProductResponseDto> implements IProductService {

    @Autowired
    private IProductCategoryService categoryService;
    @Autowired
    public ProductServiceImp(ProductRepository repository, ProductMapper mapper) {
        super(repository, mapper, new ProductNotFoundException("There isn't a product with that id") );
    }

    @Override
    public List<Product> findByName(String productName) {
        return ((ProductRepository)super.getRepository()).findByName(productName);
    }

    @Override
    public List<Product> findByCategory(ProductCategory category) {
        return ((ProductRepository)super.getRepository()).findByCategory(category);
    }
}

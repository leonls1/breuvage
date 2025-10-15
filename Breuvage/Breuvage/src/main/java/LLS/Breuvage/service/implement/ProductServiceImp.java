package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.ProductNotFoundException;
import LLS.Breuvage.model.dto.request.ProductRequestDto;
import LLS.Breuvage.model.dto.response.ProductResponseDto;
import LLS.Breuvage.model.entity.Product;
import LLS.Breuvage.model.mapper.ProductMapper;
import LLS.Breuvage.repository.ProductRepository;
import LLS.Breuvage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn({"productRepository"})
public class ProductServiceImp extends GService<Product, Long, ProductRequestDto, ProductResponseDto> implements ProductService  {

    @Autowired
    public ProductServiceImp(ProductRepository repository, ProductMapper mapper) {
        super(repository, mapper, new ProductNotFoundException("There isn't a product with that id") );
    }

}

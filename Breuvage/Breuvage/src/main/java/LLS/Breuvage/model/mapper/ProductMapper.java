package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.ProductRequestDto;
import LLS.Breuvage.model.dto.response.ProductResponseDto;
import LLS.Breuvage.model.entity.Product;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GMapper<Product, ProductRequestDto, ProductResponseDto> {
}

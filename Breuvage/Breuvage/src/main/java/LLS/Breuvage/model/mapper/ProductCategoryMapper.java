package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.ProductCategoryRequestDto;
import LLS.Breuvage.model.dto.response.ProductCategoryResponseDto;
import LLS.Breuvage.model.entity.ProductCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper extends GMapper<ProductCategory, ProductCategoryRequestDto, ProductCategoryResponseDto>{
}

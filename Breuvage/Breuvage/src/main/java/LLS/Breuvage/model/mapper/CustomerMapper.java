package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.CustomerRequestDto;
import LLS.Breuvage.model.dto.response.CustomerResponseDto;
import LLS.Breuvage.model.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends GMapper<Customer, CustomerRequestDto, CustomerResponseDto> {
}

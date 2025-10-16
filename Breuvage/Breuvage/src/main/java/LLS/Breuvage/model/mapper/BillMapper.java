package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.BillRequestDto;
import LLS.Breuvage.model.dto.response.BillResponseDto;
import LLS.Breuvage.model.entity.Bill;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BillMapper extends GMapper<Bill, BillRequestDto, BillResponseDto> {
}

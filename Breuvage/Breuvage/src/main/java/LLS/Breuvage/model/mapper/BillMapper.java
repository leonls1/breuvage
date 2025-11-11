package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.ZBillRequestDto;
import LLS.Breuvage.model.dto.response.ZBillResponseDto;

import LLS.Breuvage.model.entity.ZBill;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BillMapper extends GMapper<ZBill, ZBillRequestDto, ZBillResponseDto> {
}

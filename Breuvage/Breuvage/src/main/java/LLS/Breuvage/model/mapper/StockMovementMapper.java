package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.StockMovementRequestDto;
import LLS.Breuvage.model.dto.response.StockMovementResponseDto;
import LLS.Breuvage.model.entity.StockMovent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StockMovementMapper extends GMapper<StockMovent, StockMovementRequestDto, StockMovementResponseDto> {

}

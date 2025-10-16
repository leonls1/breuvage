package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.StockRequestDto;
import LLS.Breuvage.model.dto.response.StockResponseDto;
import LLS.Breuvage.model.entity.Stock;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StockMapper extends GMapper<Stock, StockRequestDto, StockResponseDto> {
}

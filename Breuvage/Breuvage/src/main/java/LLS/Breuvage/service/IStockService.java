package LLS.Breuvage.service;

import LLS.Breuvage.model.dto.request.StockRequestDto;
import LLS.Breuvage.model.dto.response.StockResponseDto;
import LLS.Breuvage.model.entity.Stock;

public interface IStockService extends IGService<Stock, Long, StockRequestDto, StockResponseDto>{
}

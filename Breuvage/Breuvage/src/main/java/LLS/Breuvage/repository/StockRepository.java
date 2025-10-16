package LLS.Breuvage.repository;

import LLS.Breuvage.model.dto.request.StockRequestDto;
import LLS.Breuvage.model.dto.response.StockResponseDto;
import LLS.Breuvage.model.entity.Stock;
import LLS.Breuvage.model.mapper.GMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends GRepository<Stock, Long> {
}

package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.StockNotFoundException;
import LLS.Breuvage.model.dto.request.StockRequestDto;
import LLS.Breuvage.model.dto.response.StockResponseDto;
import LLS.Breuvage.model.entity.Stock;
import LLS.Breuvage.model.entity.StockMovent;
import LLS.Breuvage.model.enums.MoventType;
import LLS.Breuvage.model.mapper.StockMapper;
import LLS.Breuvage.repository.StockRepository;
import LLS.Breuvage.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImp extends GService<Stock, Long, StockRequestDto, StockResponseDto> implements IStockService {
    @Autowired
    public StockServiceImp(StockRepository repository, StockMapper mapper){
        super(repository, mapper, new StockNotFoundException("There isn't stock with that id"));
    }

}

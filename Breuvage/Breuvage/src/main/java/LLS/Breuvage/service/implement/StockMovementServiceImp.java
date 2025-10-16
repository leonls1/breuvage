package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.StockMovementNotFoundException;
import LLS.Breuvage.model.dto.request.StockMovementRequestDto;
import LLS.Breuvage.model.dto.response.StockMovementResponseDto;
import LLS.Breuvage.model.entity.StockMovent;
import LLS.Breuvage.model.mapper.StockMovementMapper;
import LLS.Breuvage.repository.StockMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockMovementServiceImp extends GService<StockMovent, Long, StockMovementRequestDto, StockMovementResponseDto> {
    @Autowired
    public StockMovementServiceImp(StockMovementRepository repository, StockMovementMapper mapper){
        super(repository, mapper, new StockMovementNotFoundException("There isn't a movement of stock with that id"));
    }
}

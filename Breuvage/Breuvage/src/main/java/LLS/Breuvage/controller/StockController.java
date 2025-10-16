package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.StockRequestDto;
import LLS.Breuvage.model.dto.response.StockResponseDto;
import LLS.Breuvage.model.entity.Stock;
import LLS.Breuvage.service.implement.StockServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stock")
public class StockController extends GController<Stock, Long, StockRequestDto, StockResponseDto> {
    @Autowired
    public StockController(StockServiceImp service){
        super(service);
    }
}

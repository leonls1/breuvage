package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.StockRequestDto;
import LLS.Breuvage.model.dto.request.StockUpdateRequestDto;
import LLS.Breuvage.service.IStockService;
import LLS.Breuvage.service.implement.StockMovementServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stock")
@RequiredArgsConstructor
@PreAuthorize("hasAnyRole('ADMIN', 'SALES_PERSON')")
public class StockController {

    private final IStockService stockService;
    private final StockMovementServiceImp movementService;

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateStock(@PathVariable Long id,@RequestBody StockUpdateRequestDto request){
        stockService.update(request.stockRequest(), id);
        movementService.create(request.movementRequest());
        return new ResponseEntity<>("Stock updated", HttpStatus.OK);
    }


}

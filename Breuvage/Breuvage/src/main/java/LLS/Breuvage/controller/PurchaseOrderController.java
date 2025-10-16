package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.PurchaseOrderRequestDto;
import LLS.Breuvage.model.dto.response.PurchaseOrderResponseDto;
import LLS.Breuvage.model.entity.PurchaseOrder;
import LLS.Breuvage.service.IPurchaseOrderService;
import LLS.Breuvage.service.implement.PurchaseOrderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/purchase")
public class PurchaseOrderController extends GController<PurchaseOrder, Long, PurchaseOrderRequestDto, PurchaseOrderResponseDto> {
    @Autowired
    public PurchaseOrderController(PurchaseOrderServiceImp service){
        super(service);
    }
}

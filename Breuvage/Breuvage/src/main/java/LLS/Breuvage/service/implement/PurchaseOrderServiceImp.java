package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.PurchaseOrderNotFoundException;
import LLS.Breuvage.model.dto.request.PurchaseOrderRequestDto;
import LLS.Breuvage.model.dto.response.PurchaseOrderResponseDto;
import LLS.Breuvage.model.entity.PurchaseOrder;
import LLS.Breuvage.model.mapper.PurchaseOrderMapper;
import LLS.Breuvage.repository.PurchaseOrderRepository;
import LLS.Breuvage.service.IPurchaseOrderService;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderServiceImp extends GService<PurchaseOrder, Long, PurchaseOrderRequestDto, PurchaseOrderResponseDto>  implements IPurchaseOrderService {

    public PurchaseOrderServiceImp(PurchaseOrderRepository repository, PurchaseOrderMapper mapper){
        super(repository, mapper, new PurchaseOrderNotFoundException("There isn't a purchase with that id"));
    }
}

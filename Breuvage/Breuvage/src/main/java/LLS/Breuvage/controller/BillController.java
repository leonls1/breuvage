package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.BillRequestDto;
import LLS.Breuvage.model.dto.response.BillResponseDto;
import LLS.Breuvage.model.entity.Bill;
import LLS.Breuvage.repository.BillRepository;
import LLS.Breuvage.service.IBillService;
import LLS.Breuvage.service.implement.BillServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bill")
public class BillController extends GController<Bill, Long, BillRequestDto, BillResponseDto> {
    @Autowired
    public BillController(BillServiceImp service){
        super(service);
    }
}

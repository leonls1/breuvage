package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.BillNotFoundException;
import LLS.Breuvage.model.dto.request.ZBillRequestDto;
import LLS.Breuvage.model.dto.response.ZBillResponseDto;

import LLS.Breuvage.model.entity.ZBill;
import LLS.Breuvage.model.mapper.BillMapper;
import LLS.Breuvage.repository.BillRepository;
import LLS.Breuvage.service.IBillService;
import org.springframework.stereotype.Service;

@Service
public class ZBillServiceImp extends GService<ZBill, Long, ZBillRequestDto, ZBillResponseDto> implements IBillService {

    public ZBillServiceImp(BillRepository repository, BillMapper mapper) {
        super(repository, mapper, new BillNotFoundException("There isn't a bill with that id"));
    }
}

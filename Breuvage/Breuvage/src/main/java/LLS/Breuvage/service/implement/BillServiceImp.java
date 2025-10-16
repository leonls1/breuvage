package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.BillNotFoundException;
import LLS.Breuvage.model.dto.request.BillRequestDto;
import LLS.Breuvage.model.dto.response.BillResponseDto;
import LLS.Breuvage.model.entity.Bill;
import LLS.Breuvage.model.mapper.BillMapper;
import LLS.Breuvage.repository.BillRepository;
import LLS.Breuvage.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImp extends GService<Bill, Long, BillRequestDto, BillResponseDto> implements IBillService {
    @Autowired
    public BillServiceImp(BillRepository repository, BillMapper mapper){
        super(repository, mapper, new BillNotFoundException("There isn't a bill for that id"));
    }
}

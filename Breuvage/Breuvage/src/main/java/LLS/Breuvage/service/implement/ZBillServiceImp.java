package LLS.Breuvage.service.implement;

import LLS.Breuvage.model.dto.request.ZBillRequestDto;
import LLS.Breuvage.model.dto.response.ZBillResponseDto;

import LLS.Breuvage.model.entity.ZBill;
import LLS.Breuvage.model.mapper.GMapper;
import LLS.Breuvage.repository.GRepository;
import LLS.Breuvage.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZBillServiceImp extends GService<ZBill, Long, ZBillRequestDto, ZBillResponseDto> implements IBillService {

    @Autowired
    public ZBillServiceImp(GRepository<ZBill, Long> repository, GMapper<ZBill, ZBillRequestDto, ZBillResponseDto> mapper, RuntimeException notFoundException) {
        super(repository, mapper, notFoundException);
    }
}

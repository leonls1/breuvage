package LLS.Breuvage.service;

import LLS.Breuvage.model.dto.request.ZBillRequestDto;
import LLS.Breuvage.model.dto.response.ZBillResponseDto;
import LLS.Breuvage.model.entity.Bill;

public interface IBillService extends IGService<Bill, Long, ZBillRequestDto, ZBillResponseDto>{

}

package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.PurchaseOrderRequestDto;
import LLS.Breuvage.model.dto.response.PurchaseOrderResponseDto;
import LLS.Breuvage.model.entity.PurchaseOrder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PurchaseOrderMapper extends GMapper<PurchaseOrder, PurchaseOrderRequestDto, PurchaseOrderResponseDto> {
}

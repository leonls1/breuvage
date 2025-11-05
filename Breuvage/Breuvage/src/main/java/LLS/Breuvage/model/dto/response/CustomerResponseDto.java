package LLS.Breuvage.model.dto.response;

import LLS.Breuvage.model.entity.PurchaseOrder;

import java.util.List;

public record CustomerResponseDto(String name, String phoneNumber, String email, boolean overEighteen) {
}

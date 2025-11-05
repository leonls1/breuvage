package LLS.Breuvage.model.dto.request;

import LLS.Breuvage.model.entity.PurchaseOrder;
import jakarta.validation.constraints.Email;

import java.util.List;

public record CustomerRequestDto(String name,
                                 String phoneNumber,
                                 @Email
                                 String email,
                                 boolean overEighteen) {
}

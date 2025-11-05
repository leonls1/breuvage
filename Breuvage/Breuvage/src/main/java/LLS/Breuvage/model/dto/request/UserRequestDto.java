package LLS.Breuvage.model.dto.request;

import jakarta.validation.constraints.Email;

public record UserRequestDto(String username,
                             String password,
                             String name,
                             @Email
                             String email) {
}

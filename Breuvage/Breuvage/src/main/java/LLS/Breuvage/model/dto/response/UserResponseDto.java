package LLS.Breuvage.model.dto.response;

import LLS.Breuvage.model.enums.UserRole;
import jakarta.validation.constraints.Email;

public record UserResponseDto(String username,
                              String name,
                              @Email
                              String email,
                              UserRole role) {
}

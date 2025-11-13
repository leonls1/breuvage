package LLS.Breuvage.model.dto.request;
import jakarta.validation.constraints.Email;

public record CustomerRequestDto(
        String name,
        String phoneNumber,
        @Email
        String email,
        boolean overEighteen) {
}

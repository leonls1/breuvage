package LLS.Breuvage.model.dto.response;


public record CustomerResponseDto(
        String name,
        String phoneNumber,
        String email,
        boolean overEighteen) {
}

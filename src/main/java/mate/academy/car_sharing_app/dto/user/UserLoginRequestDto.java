package mate.academy.car_sharing_app.dto.user;

import jakarta.validation.constraints.NotBlank;
import mate.academy.car_sharing_app.validation.Email;
import org.hibernate.validator.constraints.Length;

public record UserLoginRequestDto(
        @Email
        String email,
        @NotBlank
        @Length(min = 8, max = 20)
        String password
) {
}
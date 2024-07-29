package mate.academy.car_sharing_app.dto;

import jakarta.validation.constraints.NotEmpty;
import mate.academy.car_sharing_app.validation.Email;
import org.hibernate.validator.constraints.Length;

public record RegisterUserRequestDto(
        @Email
        String email,
        @NotEmpty
        String firstName,
        @NotEmpty
        String lastName,
        @NotEmpty
        @Length(min = 8, max = 20)
        String password
) {
}

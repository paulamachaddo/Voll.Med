package med.voll.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDto(@NotBlank String address,
                         @NotBlank String number,
                         @NotBlank @Pattern(regexp = "\\d{8}") String cep,
                         @NotBlank String city,
                         @NotBlank String state) {
}

package med.voll.api.doctor;

import jakarta.validation.constraints.NotNull;
import med.voll.api.address.AddressDto;

import java.util.UUID;

public record updatingDoctor(@NotNull UUID id, String name, String phone, AddressDto address) {
}

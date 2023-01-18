package med.voll.api.patient;

import jakarta.validation.constraints.NotNull;
import med.voll.api.address.AddressDto;

import java.util.UUID;

public record updatingPatient(@NotNull UUID id, String name, String cpf, String phone, AddressDto address) {

}

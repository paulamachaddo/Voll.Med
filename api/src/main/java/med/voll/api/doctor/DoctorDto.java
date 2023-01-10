package med.voll.api.doctor;

import med.voll.api.address.AddressRegistration;

public record DoctorDto(String name, String email, String crm, Specialty specialty, AddressRegistration address) {
}

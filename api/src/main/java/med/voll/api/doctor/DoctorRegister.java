package med.voll.api.doctor;

import med.voll.api.address.AddressRegistration;

public record DoctorRegister(String name, String email, String crm, Specialty specialty, AddressRegistration address) {
}

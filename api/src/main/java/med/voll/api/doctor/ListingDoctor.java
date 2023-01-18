package med.voll.api.doctor;

import java.util.UUID;

public record ListingDoctor(UUID id, String name, String email, String crm, Specialty specialty) {

    public ListingDoctor (Doctor doctor){
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}

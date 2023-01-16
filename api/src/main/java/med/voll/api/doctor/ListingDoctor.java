package med.voll.api.doctor;

public record ListingDoctor(String name, String email, String crm, Specialty specialty) {

    public ListingDoctor (Doctor doctor){
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}

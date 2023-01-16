package med.voll.api.patient;

public record ListingPatients(String name, String email, String cpf, String phone) {

    public ListingPatients(Patient patient){
        this(patient.getName(), patient.getEmail(), patient.getCpf(), patient.getPhone());
    }
}

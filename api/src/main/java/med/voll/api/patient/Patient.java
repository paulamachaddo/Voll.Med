package med.voll.api.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;

import java.util.UUID;

@Table(name = "patients")
@Entity(name = "patients")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String email;
    private String cpf;
    private String phone;

    @Embedded
    private Address address;

    public Patient (PatientDto patient){
    this.name = patient.name();
    this.email = patient.email();
    this.cpf = patient.cpf();
    this.phone = patient.phone();
    this.address = new Address(patient.address());
    }

    public void updatePatient(updatingPatient data) {
        if (data.name() != null) {
            this.name = data.name();
        }
        if (data.cpf() != null) {
            this.cpf = data.cpf();
        }
        if (data.phone() != null) {
            this.phone = data.phone();
        }
        if (data.address() != null){
            this.address.updateData(data.address());
        }
    }
}

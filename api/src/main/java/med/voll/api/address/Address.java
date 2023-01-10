package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {

    private String address;
    private String number;
    private String cep;
    private String city;
    private String state;

    public Address(AddressRegistration data) {
        this.address = data.address();
        this.number = data.number();
        this.cep = data.cep();
        this.city = data.city();
        this.state = data.state();
    }
}

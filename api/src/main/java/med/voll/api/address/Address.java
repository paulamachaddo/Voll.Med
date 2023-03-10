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

    public Address(AddressDto data) {
        this.address = data.address();
        this.number = data.number();
        this.cep = data.cep();
        this.city = data.city();
        this.state = data.state();
    }

    public void updateData(AddressDto data) {
        if (data.address() != null){
            this.address = data.address();
        }
        if (data.number() != null){
            this.number = data.number();
        }
        if (data.cep() != null){
            this.cep = data.cep();
        }
        if (data.city() != null){
            this.city = data.city();
        }
        if (data.state() != null){
            this.state = data.state();
        }
    }
}

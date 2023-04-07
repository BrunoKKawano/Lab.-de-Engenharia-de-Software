package topgun.core.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String main;

    private String complement;

    @NonNull
    private String postalCode;

    @NonNull
    private String city;
}

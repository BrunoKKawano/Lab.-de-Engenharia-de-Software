package topgun.core.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String main;

    private String complement;

    @Column(nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String city;
}

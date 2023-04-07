package topgun.core.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;

    @NonNull
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @NonNull
    private Date birthDate;

    @NonNull
    @Enumerated(EnumType.STRING)
    private Profile profile;
}

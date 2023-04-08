package topgun.core.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
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

    @Column(nullable = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @Column(nullable = false)
    private Date birthDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Profile profile;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

}

package topgun.core.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pilot {
    @Id
    @GeneratedValue
    private long id;

    private long licenseNumber;

    @OneToOne
    @JoinColumn(name = "instructor_data_id")
    private InstructorData instructorData;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private boolean student;
}

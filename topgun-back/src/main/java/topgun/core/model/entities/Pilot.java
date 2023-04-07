package topgun.core.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @NonNull
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private boolean student;
}

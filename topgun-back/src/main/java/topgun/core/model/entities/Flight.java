package topgun.core.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Flight {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private Date startDate;
    @NonNull
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Pilot instructor;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "pilot_id")
    private Pilot pilot;
}

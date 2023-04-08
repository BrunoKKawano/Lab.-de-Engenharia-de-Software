package topgun.core.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Flight {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Pilot instructor;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @ManyToOne
    @JoinColumn(name = "pilot_id", nullable = false)
    private Pilot pilot;
}

package topgun.core.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class InstructorData {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private Date graduationDate;
    @Column(nullable = false)
    private String courseName;
    @Column(nullable = false)
    private String instituitionName;
}

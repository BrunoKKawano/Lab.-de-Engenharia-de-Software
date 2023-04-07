package topgun.core.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class InstructorData {
    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private Date graduationDate;
    @NonNull
    private String courseName;
    @NonNull
    private String instituitionName;
}

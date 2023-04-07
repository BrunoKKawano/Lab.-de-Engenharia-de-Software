package topgun.core.model.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Profile {

    EMP("Employee"),
    STU("Student"),
    PIL("Pilot"),
    INS("Instructor");

    private final String label;
}

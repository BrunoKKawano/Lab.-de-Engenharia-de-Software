package topgun.core.model.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Grade {

    A ("Excellent"),
    B("Satisfactory"),
    C("Mediocre"),
    D("Insufficient"),
    F("Failure");

    private final String label;
}

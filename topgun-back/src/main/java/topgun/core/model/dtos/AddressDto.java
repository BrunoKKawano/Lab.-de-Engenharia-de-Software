package topgun.core.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class AddressDto implements Serializable {
    @NonNull
    private String main;

    private String complement;

    @NonNull
    private String postalCode;

    @NonNull
    private String city;
}

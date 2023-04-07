package topgun.core.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserRegistrationDto implements Serializable {
    @NonNull
    private String name;

    @NonNull
    private AddressDto address;

    @NonNull
    private Date birthDate;

    @NonNull
    private String login;
    @NonNull
    private String password;
}

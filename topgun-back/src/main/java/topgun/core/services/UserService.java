package topgun.core.services;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import topgun.core.model.dtos.AddressDto;
import topgun.core.model.dtos.UserRegistrationDto;
import topgun.core.model.entities.Address;
import topgun.core.model.entities.Profile;
import topgun.core.model.entities.User;
import topgun.core.repositories.UserRepository;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public void register(UserRegistrationDto userDto){
        User entity = modelMapper.map(userDto, User.class);
        entity.setProfile(Profile.STU);
        userRepository.save(entity);
    }

    public void authenticate(String username, String password){

    }
}

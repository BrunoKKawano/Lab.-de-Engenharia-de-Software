package topgun.core.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import topgun.core.model.entities.Address;
import topgun.core.model.entities.Pilot;
import topgun.core.model.entities.Profile;
import topgun.core.model.entities.User;
import topgun.core.repositories.PilotRepository;
import topgun.core.repositories.UserRepository;

import java.util.Date;

@Component
public class DbInitUtil implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    PasswordEncoder encoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Address address = new Address();
        address.setMain("1 Av Paulista");
        address.setCity("Sao Paulo");
        address.setPostalCode("91190");

        User user = new User();
        user.setLogin("admin");
        user.setPassword(encoder.encode("password"));
        user.setProfile(Profile.EMP);
        user.setBirthDate(new Date());
        user.setAddress(address);
        user.setName("Funcionario");

        userRepository.save(user);
    }
}

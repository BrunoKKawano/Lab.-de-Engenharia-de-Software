package topgun.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import topgun.core.model.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);
    Boolean existsByLogin(String login);
}

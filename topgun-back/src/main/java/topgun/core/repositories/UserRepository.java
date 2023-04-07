package topgun.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import topgun.core.model.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

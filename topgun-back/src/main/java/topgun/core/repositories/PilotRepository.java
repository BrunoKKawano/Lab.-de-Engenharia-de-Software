package topgun.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import topgun.core.model.entities.Pilot;

public interface PilotRepository extends JpaRepository<Pilot,Long> {
}

package teran.towers.hr.management.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teran.towers.hr.management.api.entities.Position;

import java.util.UUID;

public interface IPositionRepository extends JpaRepository<Position, UUID> {

}

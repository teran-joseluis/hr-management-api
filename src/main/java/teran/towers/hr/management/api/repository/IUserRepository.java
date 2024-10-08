package teran.towers.hr.management.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teran.towers.hr.management.api.entities.User;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<User, UUID> {

}

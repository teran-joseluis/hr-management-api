package teran.towers.hr.management.api.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import teran.towers.hr.management.api.repository.entities.Project;

import java.util.UUID;

public interface IProjectRepository extends JpaRepository<Project, UUID> {

}

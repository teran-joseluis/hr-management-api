package teran.towers.hr.management.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teran.towers.hr.management.api.entities.Department;

import java.util.UUID;

public interface IDepartmentRepository extends JpaRepository<Department, UUID> {

}

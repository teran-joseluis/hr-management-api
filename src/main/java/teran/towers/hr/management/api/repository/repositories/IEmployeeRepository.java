package teran.towers.hr.management.api.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import teran.towers.hr.management.api.repository.entities.Employee;

import java.util.UUID;

public interface IEmployeeRepository extends JpaRepository<Employee, UUID> {

}

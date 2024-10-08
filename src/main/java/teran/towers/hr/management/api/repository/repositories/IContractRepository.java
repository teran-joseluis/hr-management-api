package teran.towers.hr.management.api.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teran.towers.hr.management.api.repository.entities.Contract;

import java.util.UUID;

@Repository
public interface IContractRepository extends JpaRepository<Contract, UUID> {

}

package bo.edu.ucb.crud.Enterprise;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<EnterpriseEntity, Integer> {

    Optional<EnterpriseEntity> findEnterpriseByEmail(String email);
}

package bo.edu.ucb.crud.career;

import java.util.Optional;

import bo.edu.ucb.crud.career.CareerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerRepository extends JpaRepository<CareerEntity, Integer> {

    Optional<CareerEntity> findCareerBycareerId(Integer careerId);
}

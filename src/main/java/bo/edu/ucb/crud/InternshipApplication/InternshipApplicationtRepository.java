package bo.edu.ucb.crud.InternshipApplication;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipApplicationtRepository extends JpaRepository<InternshipApplicationEntity, Integer> {

}

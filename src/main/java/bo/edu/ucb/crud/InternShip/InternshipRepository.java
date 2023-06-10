package bo.edu.ucb.crud.InternShip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipRepository extends JpaRepository<InternshipEntity, Integer> {
    //holas
}

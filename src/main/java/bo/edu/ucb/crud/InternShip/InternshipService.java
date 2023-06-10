package bo.edu.ucb.crud.InternShip;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InternshipService {

    private InternshipRepository internshipRepository;

    @Autowired
    public InternshipService(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    public List<InternshipEntity> getInternships(){
        return internshipRepository.findAll();
    }

    public ResponseEntity<Object> addNewInternship(InternshipEntity internship){  
        HashMap<String, Object> datos = new HashMap<>();

        internshipRepository.save(internship);
        datos.put("datos", internship);
        datos.put("message", "Se registró con exito");
        return new ResponseEntity<>(datos, HttpStatus.CREATED);
    } 
    
}

package bo.edu.ucb.crud.InternshipApplication;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InternshipApplicationService {

    private final InternshipApplicationtRepository internshipApplicationtRepository;

    @Autowired
    public InternshipApplicationService(InternshipApplicationtRepository internshipApplicationtRepository){
        this.internshipApplicationtRepository = internshipApplicationtRepository;
    }

    public List<InternshipApplicationEntity>getInternshipapplication(){

        return this.internshipApplicationtRepository.findAll();
	}
    
    public ResponseEntity<Object> addNewInternshipapplication(InternshipApplicationEntity internshipApplication){  
        HashMap<String, Object> datos = new HashMap<>();

        internshipApplicationtRepository.save(internshipApplication);
        datos.put("datos", internshipApplication);
        datos.put("message", "Se registró con exito");
        return new ResponseEntity<>(datos, HttpStatus.CREATED);
    } 
}

package bo.edu.ucb.crud.InternShip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/internships")
public class IntershipController {

    private final InternshipService internshipService;

    @Autowired
    public IntershipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping
    public List<InternshipEntity>getInternships(){
        return internshipService.getInternships();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewEntity(@RequestBody InternshipEntity internship){
        return this.internshipService.addNewInternship(internship);
    }
    
    
    
}

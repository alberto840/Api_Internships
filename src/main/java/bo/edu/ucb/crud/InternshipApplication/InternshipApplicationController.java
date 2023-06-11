package bo.edu.ucb.crud.InternshipApplication;

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
@RequestMapping(path = "api/v1/internshipapplications")
public class InternshipApplicationController {
    
	private final InternshipApplicationService internshipApplicationService;
	
    @Autowired
    public InternshipApplicationController(InternshipApplicationService internshipApplicationService) {
        this.internshipApplicationService = internshipApplicationService;
    }

    @GetMapping
    public List<InternshipApplicationEntity> getInternshipapplication(){
        return internshipApplicationService.getInternshipapplication();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewInternshipapplication(@RequestBody InternshipApplicationEntity internshipapplication){
        return this.internshipApplicationService.addNewInternshipapplication(internshipapplication);
    }
    
}

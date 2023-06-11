package bo.edu.ucb.crud.career;

import java.util.List;

import bo.edu.ucb.crud.Enterprise.EnterpriseEntity;
import bo.edu.ucb.crud.Enterprise.EnterpriseService;
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
@RequestMapping(path = "api/v1/careers")
public class CareerController {

    private final CareerService careerService;

    @Autowired
    public CareerController(CareerService careerService) {
        this.careerService = careerService;
    }

    @GetMapping
    public List<CareerEntity> getCareers(){
        return careerService.getCareers();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewEnterprise(@RequestBody CareerEntity career){
        return this.careerService.addNewCareer(career);
    }

}


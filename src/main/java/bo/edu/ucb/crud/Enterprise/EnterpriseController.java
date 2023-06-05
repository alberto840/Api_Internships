package bo.edu.ucb.crud.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/enterprise")
public class EnterpriseController {

    private final EnterpriseService EnterpriseService;

    @Autowired
    public EnterpriseController(EnterpriseService EnterpriseService) {
        this.EnterpriseService = studentService;
    }

    @GetMapping
    public List<EnterpriseEntity> getEnterprises(){
        return EnterpriseService.getEnterprise();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewEnterprise(@RequestBody EnterpriseEntity enterprise){
        return this.EnterpriseService.addNewEnterprises(enterprise);
    }

}

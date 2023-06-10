package bo.edu.ucb.crud.Enterprise;

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
    public EnterpriseController(EnterpriseService enterpriseService) {
        this.EnterpriseService = enterpriseService;
    }

    @GetMapping
    public List<EnterpriseEntity> getEnterprises(){
        return EnterpriseService.getEnterprises();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewEnterprise(@RequestBody EnterpriseEntity enterprise){
        return this.EnterpriseService.addNewEnterprise(enterprise);
    }

}

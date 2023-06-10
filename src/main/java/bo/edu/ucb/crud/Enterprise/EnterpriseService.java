package bo.edu.ucb.crud.Enterprise;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {

    private final EnterpriseRepository EnterpriseRepository;

    @Autowired
    public EnterpriseService(EnterpriseRepository EnterpriseRepository){
        this.EnterpriseRepository = EnterpriseRepository;
    }

    public List<EnterpriseEntity>getEnterprises(){
        return this.EnterpriseRepository.findAll();
    }
    public ResponseEntity<Object> addNewEnterprise(EnterpriseEntity enterprise){
        Optional<EnterpriseEntity> res = EnterpriseRepository.findEnterpriseByEmail(enterprise.getEnterpriseEmail());
        HashMap<String, Object> datos = new HashMap<>();

        if(res.isPresent()){
            datos.put("error", true);
            datos.put("message", "Ya existe persona con ese email");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        EnterpriseRepository.save(enterprise);
        datos.put("datos", enterprise);
        datos.put("message", "Se registró con exito");
        return new ResponseEntity<>(datos, HttpStatus.CREATED);
    }
}



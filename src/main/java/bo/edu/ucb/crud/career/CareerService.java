package bo.edu.ucb.crud.career;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import bo.edu.ucb.crud.career.CareerEntity;
import bo.edu.ucb.crud.career.CareerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CareerService {

    private final CareerRepository careerRepository;

    @Autowired
    public CareerService(CareerRepository careerRepository){
        this.careerRepository = careerRepository;
    }

    public List<CareerEntity>getCareers(){
        return this.careerRepository.findAll();
    }
    public ResponseEntity<Object> addNewCareer(CareerEntity career){
        Optional<CareerEntity> res = careerRepository.findCareerBycareerId(career.getCareerId());
        HashMap<String, Object> datos = new HashMap<>();

        if(res.isPresent()){
            datos.put("error", true);
            datos.put("message", "Ya existe carrera con este id");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        careerRepository.save(career);
        datos.put("datos", career);
        datos.put("message", "Se registró con exito una carrera");
        return new ResponseEntity<>(datos, HttpStatus.CREATED);
    }
}

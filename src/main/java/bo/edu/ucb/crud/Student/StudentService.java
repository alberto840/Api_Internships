package bo.edu.ucb.crud.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity>getStudents(){

        return this.studentRepository.findAll();
	}
    
    public ResponseEntity<Object> addNewStudents(StudentEntity student){
		Optional<StudentEntity> res = studentRepository.findStudentByEmail(student.getEmail());
        HashMap<String, Object> datos = new HashMap<>();

        if(res.isPresent()){
            datos.put("error", true);
            datos.put("message", "Ya existe persona con ese email");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        studentRepository.save(student);
        datos.put("datos", student);
        datos.put("message", "Se registró con exito");
        return new ResponseEntity<>(datos, HttpStatus.CREATED);
	}
}

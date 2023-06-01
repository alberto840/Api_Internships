package bo.edu.ucb.crud.Student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<StudentEntity>getStudents(){
		return List.of( new StudentEntity(1,"Juan","Perez","juan@ucb.edu.bo","juan","123","2019","1","1"));
	}
    
}

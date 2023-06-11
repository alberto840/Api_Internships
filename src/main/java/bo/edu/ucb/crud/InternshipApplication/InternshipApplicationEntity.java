package bo.edu.ucb.crud.InternshipApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class InternshipApplicationEntity {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;    
    private String id_student;    
    private String id_internship;
    private String aplicationdate;

    //Constructor vacio
    public InternshipApplicationEntity() {
    }   

    //Constructor con parametros

    public InternshipApplicationEntity(Integer studentId, String id_student, String id_internship,
            String aplicationdate) {
        this.studentId = studentId;
        this.id_student = id_student;
        this.id_internship = id_internship;
        this.aplicationdate = aplicationdate;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public String getId_internship() {
        return id_internship;
    }

    public void setId_internship(String id_internship) {
        this.id_internship = id_internship;
    }

    public String getAplicationdate() {
        return aplicationdate;
    }

    public void setAplicationdate(String aplicationdate) {
        this.aplicationdate = aplicationdate;
    }  
    
    
    
}

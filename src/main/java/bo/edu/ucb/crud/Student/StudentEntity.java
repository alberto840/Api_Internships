package bo.edu.ucb.crud.Student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentEntity {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String firstName;  
    private String lastName;
    @Column(unique = true)
    private String email;
    private String username;
    private String password;
    private String year;
    private String semester;
    private String id_career;

    //Constructor vacio
    public StudentEntity() {
    }

    //Constructor con parametros
    public StudentEntity(Integer studentId, String firstName, String lastName, String email, String username,
            String password, String year, String semester, String id_career) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.year = year;
        this.semester = semester;
        this.id_career = id_career;
    }

    //Constructor loguin
    public StudentEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getId_career() {
        return id_career;
    }

    public void setId_career(String id_career) {
        this.id_career = id_career;
    }

    
    
    
}

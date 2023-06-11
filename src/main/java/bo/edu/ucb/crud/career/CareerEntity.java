package bo.edu.ucb.crud.career;

import jakarta.persistence.*;

@Entity
@Table
public class CareerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer careerId;
    private String careerName;
    private String careerDescription;

    public CareerEntity(Integer careerId, String careerName, String careerDescription) {
        this.careerId = careerId;
        this.careerName = careerName;
        this.careerDescription = careerDescription;
    }


    public CareerEntity() {

    }

    public Integer getCareerId() {
        return careerId;
    }

    public void setCareerId(Integer careerId) {
        this.careerId = careerId;
    }

    public String getCareerName() {
        return careerName;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName;
    }

    public String getCareerDescription() {
        return careerDescription;
    }

    public void setCareerDescription(String careerDescription) {
        this.careerDescription = careerDescription;
    }
}

package bo.edu.ucb.crud.Enterprise;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class EnterpriseEntity {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enterpriseId;
    private String documentID;  
    private String enterpriseName;
    @Column(unique = true)
    private String enterpriseEmail;
    private String username;
    private String password;
    

    //Constructor vacio
    public EnterpriseEntity() {
    }
    public EnterpriseEntity(Integer enterpriseId,
        String documentID, String enterpriseName,
        String enterpriseEmail, String username, String password){

            this.enterpriseId=enterpriseId;
            this.documentID=documentID;
            this.enterpriseName=enterpriseName;
            this.enterpriseEmail=enterpriseEmail;
            this.username=username;
            this.username=password;
    }
     //Constructor loguin
    public EnterpriseEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
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
}

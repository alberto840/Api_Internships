package bo.edu.ucb.crud.InternShip;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class InternshipEntity {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_deal;
    private Integer id_enterprise;
    private String titleDeal;
    private String detailsDeal;
    private Date starDate;
    private Date endDate;

    //Constructor vacio
    public InternshipEntity() {
    }

    //Constructor con parametros
    public InternshipEntity(Integer id_deal, Integer id_enterprise, String titleDeal, String detailsDeal, Date starDate,
            Date endDate) {
        this.id_deal = id_deal;
        this.id_enterprise = id_enterprise;
        this.titleDeal = titleDeal;
        this.detailsDeal = detailsDeal;
        this.starDate = starDate;
        this.endDate = endDate;
    }

    public Integer getId_deal() {
        return id_deal;
    }

    public void setId_deal(Integer id_deal) {
        this.id_deal = id_deal;
    }

    public String getTitleDeal() {
        return titleDeal;
    }

    public void setTitleDeal(String titleDeal) {
        this.titleDeal = titleDeal;
    }

    public String getDetailsDeal() {
        return detailsDeal;
    }

    public void setDetailsDeal(String detailsDeal) {
        this.detailsDeal = detailsDeal;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getId_enterprise() {
        return id_enterprise;
    }

    public void setId_enterprise(Integer id_enterprise) {
        this.id_enterprise = id_enterprise;
    }
    
    
}


package poe20221107.poe20221107.demojpa.clientOrder;

import poe20221107.poe20221107.demojpa.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="type_presta")
    private String typePresta;
    @Column(name="designation")
    private String designation;
    @Column(name="nbdays")
    private int nbdays;
    @Column(name="unit_price")
    private float unitPrice;

    public Order(String typePresta, String designation, int nbdays, float unitPrice) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.nbdays = nbdays;
        this.unitPrice = unitPrice;
    }
    public Order(){
    }

    public String getTypePresta() {
        return typePresta;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getNbdays() {
        return nbdays;
    }

    public void setNbdays(int nbdays) {
        this.nbdays = nbdays;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author My Pc
 */
@Entity
public class Bus {
    @GeneratedValue
    @Id
    private int busID;
    @Column(unique=true)
    private String busLisance;

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public String getBusLisance() {
        return busLisance;
    }

    public void setBusLisance(String busLisance) {
        this.busLisance = busLisance;
    }

    
}

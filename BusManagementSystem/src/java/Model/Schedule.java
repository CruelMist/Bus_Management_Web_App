/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author My Pc
 */
@Entity
public class Schedule {
    @GeneratedValue
    @Id
    private int schId;
    private String busLisance;
    private String driverName;
    private String driverContact;
    private String route;
    private String date;

    public int getSchId() {
        return schId;
    }

    public void setSchId(int schId) {
        this.schId = schId;
    }

    public String getBusLisance() {
        return busLisance;
    }

    public void setBusLisance(String busLisance) {
        this.busLisance = busLisance;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverContact() {
        return driverContact;
    }

    public void setDriverContact(String driverContact) {
        this.driverContact = driverContact;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

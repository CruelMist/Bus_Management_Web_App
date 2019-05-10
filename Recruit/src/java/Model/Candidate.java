/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author My Pc
 */
@Entity
public class Candidate {
    @Id
    private String Email;
    @Column(unique=true)
    private String username;
    private String fname;
    private String lname;
    private String phone;
    private String address;
    private String city;
    private String state;
    private float marks10;
    private String school10;
    private float marks12;
    private String school12;
    private float cgpa;
    private String college;
    private String cabout;

    public String getCabout() {
        return cabout;
    }

    public void setCabout(String cabout) {
        this.cabout = cabout;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getMarks10() {
        return marks10;
    }

    public void setMarks10(float marks10) {
        this.marks10 = marks10;
    }

    public String getSchool10() {
        return school10;
    }

    public void setSchool10(String school10) {
        this.school10 = school10;
    }

    public float getMarks12() {
        return marks12;
    }

    public void setMarks12(float marks12) {
        this.marks12 = marks12;
    }

    public String getSchool12() {
        return school12;
    }

    public void setSchool12(String school12) {
        this.school12 = school12;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

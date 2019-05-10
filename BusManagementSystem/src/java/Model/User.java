/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author My Pc
 */
@Entity
public class User {
//    @GeneratedValue
//    @Column(unique=true)
//    private int id;
//    
    @Id
    private String email;
    private String pwd;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public int hashCode()
    {
        int num=Integer.parseInt(pwd);
        return num;
    }
    @Override
    public boolean equals(Object o)
    {
        User a=(User)o;
        return (email.equals(a.email)&&pwd.equals(a.pwd)&&type.equals(a.type));
    }
    @Override
    public String toString()
    {
        return this.email;
    }
}

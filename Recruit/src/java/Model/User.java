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
public class User {
    @Id
    private String email;
    @Column(unique=true)
    private String username;
    private String password;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public int hashCode()
    {
        int num=Integer.parseInt(password);
        return num;
    }
    @Override
    public boolean equals(Object o)
    {
        User a=(User)o;
        return (email.equals(a.email)&&password.equals(a.password));
    }
    @Override
    public String toString()
    {
        return this.email;
    }
}

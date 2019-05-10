/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

/**
 *
 * @author My Pc
 */
public class UserDAO {
    public boolean check(User u)
    {
//        String q1="from User where mail= :mail and password= :pass";
        Configuration cf=null;
//        List <User> list=null;
        SessionFactory sf=null;
        Session session=null;
        User db_user = null;
        try{
            cf=new Configuration();
            cf.configure();
            
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            
//            Transaction tx=session.beginTransaction();
            
            db_user = (User) session.get(User.class,u.getEmail());
//            Query query = session.createQuery("from User where email = :m AND password = :n");
//            query.setParameter("m", u.getEmail());
//            query.setParameter("n", u.)
            System.out.println(u.getEmail());
            System.out.println(db_user);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            session.close();
            sf.close();
        }
        
        if(db_user == null) return false;
        else{
            System.out.println(db_user.getEmail()+" "+u.getEmail());
            System.out.println(db_user.getPwd()+" "+u.getPwd());
            System.out.println(db_user.getType()+" "+u.getType());
            return db_user.equals(u);
        }
            
    }
    
    public List<User> getUser()
    {
        String st="from User";
        List<User> list=null;
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        try{
            cf=new Configuration();
            cf.configure();
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            Transaction tx=session.beginTransaction();
            Query query1=session.createQuery(st);
            list=query1.list();
            tx.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            session.close();
            sf.close();
        }
        return list;
    }
    
    public void deleteUser(String useLisance){
        String st="delete from User where pwd = :n";
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        try{
            cf=new Configuration();
            cf.configure();
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            Transaction tx=session.beginTransaction();
            Query query1=session.createQuery(st);
            query1.setParameter("n", useLisance);
            query1.executeUpdate();
            System.out.println(useLisance);
            tx.commit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            session.close();
            sf.close();
        }
    }
    
    public void addUser(User b)
    {
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        User use=b;
        try{
         cf=new Configuration();
         cf.configure();
         sf=cf.buildSessionFactory();
         session=sf.openSession();
         Transaction tx=session.beginTransaction();
         session.save(use);
         tx.commit();
         System.out.println("Added new bus");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
    }
            
}

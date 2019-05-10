/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author My Pc
 */
public class Demo {
    public static void main(String[] args)
    {
        User e=new User();
//        e.setFeedId(0);
        e.setEmail("staff1@gmail.com");
        e.setPwd("staff1");
        e.setType("staff");
//        e.setRoute("Baddi-Kalka-Pinjore-Zirakpur");
//        e.setDriverContact("7009146749");
//        e.setDriverName("Suresh Prakash");
//        e.setDate("2019-03-05");
//        e.setContact("9817147199");
//        e.setType("student");
        
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        
        try
        {
            cf=new Configuration();
            cf.configure();
        
            sf=cf.buildSessionFactory();
        
            session=sf.openSession();
        
            Transaction tx=session.beginTransaction();
            session.save(e);
            tx.commit();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
        System.out.println("Build Successful");
    }
    
}

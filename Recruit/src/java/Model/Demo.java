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
        Recruiter_Jobs e=new Recruiter_Jobs();
        e.setEmail("recruiter1@gmail.com");
        e.setJob("Tester");
        e.setJobDescription("Test");
        e.setVacancy(1);
//        e.setPassword("recruiter1");
//        e.setType("recruiter");
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

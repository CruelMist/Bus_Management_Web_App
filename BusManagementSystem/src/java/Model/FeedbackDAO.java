/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author My Pc
 */
public class FeedbackDAO {
    public void addFeed(Feedback b)
    {
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        Feedback reckoning=b;
        try{
         cf=new Configuration();
         cf.configure();
         sf=cf.buildSessionFactory();
         session=sf.openSession();
         Transaction tx=session.beginTransaction();
         session.save(reckoning);
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
    
    public List<Feedback> getFeed()
    {
        String st="from Feedback";
        List<Feedback> list=null;
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
}

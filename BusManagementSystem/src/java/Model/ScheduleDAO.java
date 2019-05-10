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
public class ScheduleDAO {
    public void addSch(Schedule sh)
    {
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        Schedule judgementDay=sh;
        try{
         cf=new Configuration();
         cf.configure();
         sf=cf.buildSessionFactory();
         session=sf.openSession();
         Transaction tx=session.beginTransaction();
         session.save(judgementDay);
         tx.commit();
         System.out.println("Added new schedule");
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
    public List<Schedule> getSch()
    {
        String st="from Schedule";
        List<Schedule> list=null;
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
    public void deleteSch(String route){
        String st="delete from Schedule where route = :m";
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
//            query1.setParameter("n", driverName);
            query1.setParameter("m",route);
            query1.executeUpdate();
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
}

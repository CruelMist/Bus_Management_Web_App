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
public class BusDAO {
    public void addBus(Bus b)
    {
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        Bus bigBus=b;
        try{
         cf=new Configuration();
         cf.configure();
         sf=cf.buildSessionFactory();
         session=sf.openSession();
         Transaction tx=session.beginTransaction();
         session.save(bigBus);
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
    public List<Bus> getBus()
    {
        String st="from Bus";
        List<Bus> list=null;
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
    public void deleteBus(String busLisance){
        String st="delete from Bus where busLisance = :n";
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
            query1.setParameter("n", busLisance);
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

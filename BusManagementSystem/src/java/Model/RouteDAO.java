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
public class RouteDAO {
    public void addRoute(Route r)
    {
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
        Route gloriousPath=r;
        try{
         cf=new Configuration();
         cf.configure();
         sf=cf.buildSessionFactory();
         session=sf.openSession();
         System.out.println("DAO"+" "+gloriousPath.getRoute());
         Transaction tx=session.beginTransaction();
         session.save(gloriousPath);
         tx.commit();
         System.out.println("Added new route");
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
    public List<Route> getRoute()
    {
        String st="from Route";
        List<Route> list=null;
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
    public void deleteRoute(String route){
        String st="delete from Route where route = :n";
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
            query1.setParameter("n", route);
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

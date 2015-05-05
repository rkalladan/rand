package com.rand.sprhib.main;

import org.hibernate.Session;

import com.rand.sprhib.dao.HibernateUtil;
import com.rand.sprhib.model.Stock;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        session.save(stock);
        session.getTransaction().commit();
    }
}

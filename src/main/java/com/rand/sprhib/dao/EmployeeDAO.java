package com.rand.sprhib.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.rand.sprhib.model.Employee;

/**
 * @author kalladanr
 * hibernate template is deprecated one and will be using session factory instead of it.
 *
 */

public class EmployeeDAO {
	private HibernateTemplate hibernateTemplate;
	private SessionFactory sessionFactory;
	private Session session;
	
	/**
	 * @return new sessions 
	 */
	public Session getSession(){
		return sessionFactory.openSession();
	}
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void setHibernateTemplate(HibernateTemplate
                             hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate(){
        return hibernateTemplate;
    }

 /*   *//**
     * @param id
     * @return
     * commenting it for future reference and no more using this.
     *//*
    public Employee getEmployee(final String id){
        HibernateCallback callback = new HibernateCallback() {
            public Object doInHibernate(Session session)
                throws HibernateException,SQLException {
                return session.load(Employee.class, id);
            }
        };
        return (Employee)hibernateTemplate.execute(callback);
    }*/

    public Employee getEmployee(int id){
    	session=getSession();
    	try{
    		Employee emp=(Employee) session.load(Employee.class, id);
    		Hibernate.initialize(emp);//to avoid lazy initialization exception do this line.
    		return emp;
    	}finally{
    		session.close();
    	}
    }
    public void saveOrUpdate(final Employee employee){
       session=getSession();
       try{
    	   session.saveOrUpdate(employee);
    	   session.beginTransaction().commit();
       }finally{
    	   session.close();
       }
    }
}

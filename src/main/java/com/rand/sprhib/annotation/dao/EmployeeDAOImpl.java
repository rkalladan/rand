package com.rand.sprhib.annotation.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rand.sprhib.annotation.model.Empl;
import com.rand.sprhib.annotation.model.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	 
	public void insert(Employee employee) {
	Session session = getSessionFactory().openSession();
	session.beginTransaction();
	session.saveOrUpdate(employee);
	session.getTransaction().commit();
	}
	 
	public List<Employee> selectAll() {
	Session session = getSessionFactory().openSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Employee.class);
	@SuppressWarnings("unchecked")
	List<Employee> employees = (List<Employee>) criteria.list();
	session.getTransaction().commit();
	return employees;
	}

	public void saveEmpl(Empl empl) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.saveOrUpdate(empl);
		session.getTransaction().commit();
	}
}

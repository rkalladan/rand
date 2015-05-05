package com.rand.sprhib.annotation.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rand.sprhib.annotation.model.Employee;

@Repository
public class EmployeeDAO {
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
	return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}
	 
	public void insert(Employee employee) {
	Session session = getSessionFactory().getCurrentSession();
	session.beginTransaction();
	session.save(employee);
	session.getTransaction().commit();
	 
	}
	 
	public List<Employee> selectAll() {
	Session session = getSessionFactory().getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Employee.class);
	@SuppressWarnings("unchecked")
	List<Employee> employees = (List<Employee>) criteria.list();
	session.getTransaction().commit();
	return employees;
	}
}

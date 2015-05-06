package com.rand.sprhib.annotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rand.sprhib.annotation.dao.EmployeeDAO;
import com.rand.sprhib.annotation.model.Empl;
import com.rand.sprhib.annotation.model.Employee;
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO dao;

	public void insert(Employee employee) {
		dao.insert(employee);
	}

	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	public void saveEmpl(Empl empl) {
		dao.saveEmpl(empl);
	}

}

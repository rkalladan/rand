package com.rand.sprhib.annotation.dao;

import java.util.List;

import com.rand.sprhib.annotation.model.Empl;
import com.rand.sprhib.annotation.model.Employee;

public interface EmployeeDAO {

	public void insert(Employee employee);
	public List<Employee> selectAll();
	public void saveEmpl(Empl empl);
}

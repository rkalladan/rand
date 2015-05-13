package com.rand.sprhib.annotation.service;

import java.util.List;

import com.rand.sprhib.annotation.model.Empl;
import com.rand.sprhib.annotation.model.Employee;
import com.rand.sprhib.annotation.model.Role;
import com.rand.sprhib.annotation.model.User;

public interface EmployeeService {
	public void insert(Employee employee);
	public List<Employee> selectAll();
	public void saveEmpl(Empl empl);
	public void saveRole(Role role);
	public void saveUser(User user);
	public Role getRolename(long id);
	public List<User> selectAllUsers();
}

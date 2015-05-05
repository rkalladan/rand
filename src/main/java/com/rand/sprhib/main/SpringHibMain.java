package com.rand.sprhib.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.rand.sprhib.dao.EmployeeDAO;
import com.rand.sprhib.model.Employee;

public class SpringHibMain {

	public static void main(String[] args) {

        Resource resource = new FileSystemResource(
            "./src/main/resources/spring-hibernate.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Employee employee = new Employee();
        //employee.setId("123");
        employee.setName("ABC");
        employee.setAge(20);
        employee.setSalary(15000.00d);

        EmployeeDAO employeeDao = (EmployeeDAO)factory.getBean(
            "employeeDao");
        employeeDao.saveOrUpdate(employee);

        Employee empResult = employeeDao.getEmployee(1);
        System.out.println(empResult.toString());

	}

}

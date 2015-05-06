package com.rand.sprhib.main;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.rand.sprhib.dao.EmployeeDAO;
import com.rand.sprhib.model.Employee;

public class SpringHibMain {
	private static final Logger logger = Logger.getLogger(SpringHibMain.class);

	public static void main(String[] args) {
		logger.info("Entered the main class-------");
        Resource resource = new FileSystemResource(
            "./src/main/resources/spring-hibernate.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Employee employee = new Employee();
        //employee.setId("123");
        employee.setName("dkfhkjsdkfhkj");
        employee.setAge(27);
        employee.setSalary(15350.00d);

        EmployeeDAO employeeDao = (EmployeeDAO)factory.getBean(
            "employeeDao");
        employeeDao.saveOrUpdate(employee);

        Employee empResult = employeeDao.getEmployee(4);
        System.out.println(empResult.toString());

	}

}

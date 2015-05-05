package com.rand.sprhib.main;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rand.sprhib.annotation.dao.EmployeeDAO;
import com.rand.sprhib.annotation.model.Employee;

public class SpringhibAnnotateMain {

	private static Logger logger=Logger.getLogger(SpringhibAnnotateMain.class);
	public static void main(String[] args) {
		logger.info("************** BEGINNING PROGRAM **************");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate-annotation.xml");
		EmployeeDAO dao=(EmployeeDAO) context.getBean("employeeDAO");
		Employee emp=new Employee();
		emp.setName("ABC");
        emp.setAge(20);
        emp.setSalary(15000.00d);
        dao.insert(emp);
        List<Employee> list=dao.selectAll();
        System.out.println("The list is"+list);
		System.out.println("************** ENDING PROGRAM *****************");
	}

}

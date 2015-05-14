package com.rand.sprhib.main;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rand.sprhib.annotation.model.Empl;
import com.rand.sprhib.annotation.model.Employee;
import com.rand.sprhib.annotation.model.Role;
import com.rand.sprhib.annotation.model.User;
import com.rand.sprhib.annotation.service.EmployeeService;

public class SpringhibAnnotateMain {

	private static Logger logger=Logger.getLogger(SpringhibAnnotateMain.class);
	public static void main(String[] args) {
		logger.info("************** BEGINNING PROGRAM **************");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate-annotation.xml");
		EmployeeService service=(EmployeeService) context.getBean("employeeService");
		/*Empl emp=new Empl();
		emp.setName("sjkdfjksnknxzc");
		emp.setSalary(new BigDecimal(10000));
        emp.setSsn("ssn00000003");
        service.saveEmpl(emp);*/
		/*Role role1 =new Role();
		role1.setRolename("developer");
		service.saveRole(role1);*/
		/*Role role=service.getRolename(2);
		User user1=new User();
		user1.setPassword("rk1");
		user1.setUsername("rk1");
		user1.setRole(role);
		service.saveUser(user1);*/
		List<User> list=service.selectAllUsers();
        //List<Employee> list=service.selectAll();
        System.out.println("The list is"+list);
		System.out.println("************** ENDING PROGRAM *****************");
	}

}
 
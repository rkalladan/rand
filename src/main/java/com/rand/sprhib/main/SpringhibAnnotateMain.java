package com.rand.sprhib.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		role1.setRolename("admin");
		service.saveRole(role1);*/
		Role role=service.getRolename(1);
		Role role2=service.getRolename(2);
		Set<Role> roleList=new HashSet<Role>();
		roleList.add(role);
		roleList.add(role2);
		User user1=new User();
		user1.setPassword("rk2");
		user1.setUsername("rk2");
		user1.setRoleList(roleList);
		service.saveUser(user1);
		List<User> list=service.selectAllUsers();
        //List<Employee> list=service.selectAll();
        System.out.println("The list is"+list);
		System.out.println("************** ENDING PROGRAM *****************");
	}

}
 
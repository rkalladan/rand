package com.rand;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class RandMain {

	public static void main(String[] args) {
		Resource resource = new FileSystemResource("./src/main/resources/springbeans.xml");
		BeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		EmployeeBeanFactory empFactory=(EmployeeBeanFactory) xmlBeanFactory.getBean("beanFactory");
		Employee emp=empFactory.getEmployee();
		System.out.println(emp.getBeanName()+"=="+emp.getEmpid()+"=="+emp.getName());
		System.out.println(empFactory.getClassLoader().getClass());
	}

}

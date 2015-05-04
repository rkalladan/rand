package com.rand;

import org.springframework.beans.factory.BeanNameAware;

public class Employee implements BeanNameAware{
	
	private int empid;
	private String name;
	private String beanName;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		this.beanName=arg0;
	}
	

}

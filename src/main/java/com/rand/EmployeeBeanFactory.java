package com.rand;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class EmployeeBeanFactory implements BeanFactoryAware,BeanClassLoaderAware{
	private BeanFactory beanFactory;
	private ClassLoader classLoader;

	public void setBeanFactory(BeanFactory beanfactory) throws BeansException {
		this.beanFactory=beanfactory;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}
	
	public Employee getEmployee(){
		return (Employee) beanFactory.getBean("employee");
	}

	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		this.classLoader=classLoader;
		System.out.println("Inside setting class loaders!!!!");
	}
	
	public ClassLoader getClassLoader(){
		return classLoader;
	}
}

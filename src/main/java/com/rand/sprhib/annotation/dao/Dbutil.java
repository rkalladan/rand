package com.rand.sprhib.annotation.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class Dbutil {
	private DataSource dataSource;
	 
	public DataSource getDataSource() {
	return dataSource;
	}
	 
	public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
	}
	 
	public void initialize(){
		System.out.println("Inside initialize=======*******");
	/*DataSource dataSource = getDataSource();
	try {
	Connection connection = dataSource.getConnection();
	Statement statement = connection.createStatement();
	statement.executeUpdate("CREATE TABLE PERSON (ID INTEGER IDENTITY, NAME VARCHAR(50), EMAIL VARCHAR(100))");
	statement.close();
	connection.close();
	} catch (SQLException e) {
	e.printStackTrace();
	}*/
	}
}

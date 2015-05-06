package com.rand.sprhib.annotation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	private String name;
	private String email;
	 

	public Integer getId() {
	return id;
	}
	 
	public void setId(Integer id) {
	this.id = id;
	}
	 
	public String getName() {
	return name;
	}
	 
	public void setName(String name) {
	this.name = name;
	}
	 
	public String getEmail() {
	return email;
	}
	 
	public void setEmail(String email) {
	this.email = email;
	}
	 
	@Override
	public String toString() {
	return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}

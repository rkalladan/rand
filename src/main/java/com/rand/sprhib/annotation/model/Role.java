package com.rand.sprhib.annotation.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="INV_Role",catalog="rand")
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long role_id;
	private String rolename;
	@ManyToMany(mappedBy="roleList")
	private Set<User> userSet;
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	public long getRole_id() {
		return role_id;
	}
	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	
	
}

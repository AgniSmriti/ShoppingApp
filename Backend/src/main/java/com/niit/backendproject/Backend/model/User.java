package com.niit.backendproject.Backend.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

@Id
private String userid;
private String username;

private String password;




public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private boolean active;



public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String userame) {
	this.username = userame;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}


	
}


package com.employee.springboot.user.project.employeeProject.model;

import org.springframework.stereotype.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_info")
@Repository
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Employee_ID")
private int ID;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
private String name;
private String email_id;
public Employee(String name, String email_id) {
	super();
	this.name = name;
	this.email_id = email_id;
}

public Employee() {
}
}



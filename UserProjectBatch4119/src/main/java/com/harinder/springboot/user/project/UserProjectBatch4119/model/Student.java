package com.harinder.springboot.user.project.UserProjectBatch4119.model;

import org.springframework.stereotype.Repository;

import jakarta.persistence.*;
@Entity
@Table(name="Student_info")
@Repository
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Student_ID")
private int ID;
private String name;
private String email_id;
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
public Student(String name, String email_id) {
	super();
	this.name = name;
	this.email_id = email_id;
}
public Student(){
	
}

}

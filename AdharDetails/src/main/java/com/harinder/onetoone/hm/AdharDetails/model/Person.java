package com.harinder.onetoone.hm.AdharDetails.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="person_info")
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="person_id")
private Long id;
@Column(name="person_name")
private String name;
@Column(name="person_address")
private String address;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="adhaar_id")
private Adhaar adha;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
public Person() {
	}
public void setAddress(Adhaar a1) {
	// TODO Auto-generated method stub
	
}
}

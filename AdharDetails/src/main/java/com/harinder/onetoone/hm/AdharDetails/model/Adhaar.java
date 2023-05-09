package com.harinder.onetoone.hm.AdharDetails.model;

import jakarta.persistence.*;

@Entity
@Table(name="adhaar_info")
public class Adhaar {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="adharr_id")
private Long id;
private int adhaarNum;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getAdhaarNum() {
	return adhaarNum;
}
public void setAdhaarNum(int adhaarNum) {
	this.adhaarNum = adhaarNum;
}
public Adhaar(int adhaarNum) {
	super();
	this.adhaarNum = adhaarNum;
}
public Adhaar() {
	
}
}


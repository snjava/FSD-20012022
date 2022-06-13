package org.institute.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "phbook") // is used to customize the table name by default Entity class name will be a table name.
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // can generate the value of PK automatically.
	private int id;
	
	@Column(length = 30)
	private String name;
	
	// can manage the column properties by this tag.
	@Column(name = "contact", length = 10, nullable = false, unique = true)
	private String phoneNo;
	
	@Temporal(TemporalType.DATE) // Is use to set the Date, Time or DateTime for the Date type of varaible.
	private Date dob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}

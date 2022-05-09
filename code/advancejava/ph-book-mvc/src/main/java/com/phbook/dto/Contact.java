package com.phbook.dto;

//Encapsulated Class, DTO, Bean, Entity, Model, Domain
public class Contact {
	private int id;
	private String fname;
	private String lname;
	private String contact;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}

package org.institute.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String status;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp // is use to insert the system date time while inserting new record.
	private Date createts;
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp // is use to insert the system date time while updating record.
	private Date updatets;
	
	@JsonBackReference
	@ManyToOne
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatets() {
		return createts;
	}

	public void setCreatets(Date createts) {
		this.createts = createts;
	}

	public Date getUpdatets() {
		return updatets;
	}

	public void setUpdatets(Date updatets) {
		this.updatets = updatets;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

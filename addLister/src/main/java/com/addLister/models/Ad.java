package com.addLister.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ad implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
    private String title;
    private String description;
    private Timestamp timeCreated;
    @ManyToOne
	@JoinColumn(name = "USER_ID")
    private User user;
    
	public Ad(String title, String description, Timestamp timeCreated, User user) {
		super();
		this.title = title;
		this.description = description;
		this.timeCreated = timeCreated;
		this.user = user;
	}

	public Ad() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	} 
    
}

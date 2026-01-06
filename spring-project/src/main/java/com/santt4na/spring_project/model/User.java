package com.santt4na.spring_project.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "db_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String username;
	
	@Column(unique = true, nullable = true)
	private String password;
	
	@OneToMany(mappedBy = "responsibleUser")
	private List<Task> tasks = new ArrayList<>();
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User() {
	}
	
	public Integer getQtyTask(){
		return tasks.size();
	}
	
	public Long getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}

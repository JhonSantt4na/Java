package com.santt4na.Finance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Account> accounts = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Transaction> transactions = new ArrayList<>();
	
}
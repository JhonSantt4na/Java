package com.santt4na.Finance.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
	private Long id;
	
	@NotNull(message = "Name field cannot be null")
	private String name;
	
	@NotNull(message = "Password field cannot be null")
	private String password;
	
	private String email;
	
	@OneToMany(mappedBy = "user")
	private List<Account> accounts = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Transaction> transactions = new ArrayList<>();
}
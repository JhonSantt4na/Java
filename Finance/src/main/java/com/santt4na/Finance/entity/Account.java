package com.santt4na.Finance.entity;

import com.santt4na.Finance.Enums.TypeAccount;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private TypeAccount type;
	
	private Integer closingDay;
	private Integer dueDay;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "account")
	private List<Transaction> transactions = new ArrayList<>();
	
}

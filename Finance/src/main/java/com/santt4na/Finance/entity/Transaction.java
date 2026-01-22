package com.santt4na.Finance.entity;

import com.santt4na.Finance.Enums.Status;
import com.santt4na.Finance.Enums.TypeTransaction;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private BigDecimal amount;
	private String description;
	private LocalDate date;
	
	@Enumerated(EnumType.STRING)
	private TypeTransaction type;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "account_id")
	private Account account;
	
}
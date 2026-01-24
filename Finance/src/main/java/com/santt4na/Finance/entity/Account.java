package com.santt4na.Finance.entity;

import com.santt4na.Finance.Enums.TypeAccount;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TypeAccount type;
	
	@Column(nullable = false)
	private Integer closingDay;
	
	@Column(nullable = false)
	private Integer dueDay;
	
	@Column(nullable = false, precision = 19, scale = 2)
	private BigDecimal balance = BigDecimal.ZERO;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
	private List<Transaction> transactions = new ArrayList<>();
}

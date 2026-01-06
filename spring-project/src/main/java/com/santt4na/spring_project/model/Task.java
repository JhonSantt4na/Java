package com.santt4na.spring_project.model;

import com.santt4na.spring_project.enums.Priority;
import com.santt4na.spring_project.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Title cannot be null.")
	private String title;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	private Status status = Status.TODO;
	
	@Enumerated(EnumType.STRING)
	private Priority priority = Priority.MEDIUM;
	
	@OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = false)
	private List<TaskHistory> history = new ArrayList<>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "responsible_user_id", nullable = false)
	private User responsibleUser;
	
	private LocalDateTime dueDate;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	public Task(Long id, String title, String description, Status status, Priority priority, List<TaskHistory> history, User responsibleUser, LocalDateTime dueDate, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.priority = priority;
		this.history = history;
		this.responsibleUser = responsibleUser;
		this.dueDate = dueDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public Task() {
	}
	
	public void addHistory(TaskHistory h) {
		if (this.history == null) {
			this.history = new ArrayList<>();
		}
		h.setTask(this);
		this.history.add(h);
	}
	
	public Long getId() {
		return id;
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
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Priority getPriority() {
		return priority;
	}
	
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	public List<TaskHistory> getHistory() {
		return history;
	}
	
	public User getResponsibleUser() {
		return responsibleUser;
	}
	
	public void setResponsibleUser(User responsibleUser) {
		this.responsibleUser = responsibleUser;
	}
	
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}

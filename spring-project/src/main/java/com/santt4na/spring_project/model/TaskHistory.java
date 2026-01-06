package com.santt4na.spring_project.model;

import com.santt4na.spring_project.enums.HistoryField;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_task_history")
public class TaskHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "task_id")
	private Task task;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "changed_by_user_id")
	private User changedBy;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private HistoryField fieldChanged;
	
	@Column(name = "old_value")
	private String oldValue;
	
	@Column(name = "new_value")
	private String newValue;
	
	private String observation;
	
	@CreationTimestamp
	@Column(nullable = false, updatable = false)
	private LocalDateTime changedAt;
	
	public TaskHistory(Task task, User changedBy, HistoryField fieldChanged, String oldValue, String newValue, String observation, LocalDateTime changedAt) {
		this.task = task;
		this.changedBy = changedBy;
		this.fieldChanged = fieldChanged;
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.observation = observation;
		this.changedAt = changedAt;
	}
	
	public TaskHistory(Task newTask, User userResponsible) {
	}
	
	public TaskHistory() {
	}
	
	public Long getId() {
		return id;
	}
	
	public Task getTask() {
		return task;
	}
	
	public void setTask(Task task) {
		this.task = task;
	}
	
	public User getChangedBy() {
		return changedBy;
	}
	
	public void setChangedBy(User changedBy) {
		this.changedBy = changedBy;
	}
	
	public HistoryField getFieldChanged() {
		return fieldChanged;
	}
	
	public void setFieldChanged(HistoryField fieldChanged) {
		this.fieldChanged = fieldChanged;
	}
	
	public String getOldValue() {
		return oldValue;
	}
	
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	
	public String getNewValue() {
		return newValue;
	}
	
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	
	public String getObservation() {
		return observation;
	}
	
	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	public LocalDateTime getChangedAt() {
		return changedAt;
	}
	
	public void setChangedAt(LocalDateTime changedAt) {
		this.changedAt = changedAt;
	}
}

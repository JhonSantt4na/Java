package com.santt4na.spring_project.utils;

import com.santt4na.spring_project.enums.HistoryField;
import com.santt4na.spring_project.enums.Priority;
import com.santt4na.spring_project.enums.Status;
import com.santt4na.spring_project.exceptions.BusinessException;
import com.santt4na.spring_project.model.Task;
import com.santt4na.spring_project.model.TaskHistory;
import com.santt4na.spring_project.model.User;

import java.time.LocalDateTime;

public class ValidationFieldsTasks {
	
	private void applyDeadlineRules(Task task, User actor) {
		
		if (task.getDueDate() != null
			&& task.getDueDate().isBefore(LocalDateTime.now())
			&& task.getStatus() != Status.DONE
			&& task.getStatus() != Status.BLOCKED) {
			
			Status old = task.getStatus();
			task.setStatus(Status.BLOCKED);
			
			registerHistoryChange(
				task,
				HistoryField.STATUS,
				old.name(),
				Status.BLOCKED.name(),
				actor,
				"AUTOMATIC_DEADLINE_BLOCK"
			);
		}
	}
	
	private void validateCriticalPriority(Task task, String justification) {
		if (task.getPriority() == Priority.CRITICAL && (justification == null || justification.isBlank())) {
			throw new BusinessException("Justificativa obrigatória para prioridade CRITICAL.");
		}
	}
	
	private void validateResponsibleForStatus(Task task) {
		if ((task.getStatus() == Status.IN_PROGRESS || task.getStatus() == Status.DONE)
			&& task.getResponsibleUser() == null) {
			throw new BusinessException("Responsável obrigatório para este status.");
		}
	}
	
	private void validateDueDate(LocalDateTime dueDate) {
		if (dueDate != null && dueDate.isBefore(LocalDateTime.now())) {
			throw new BusinessException("Due date não pode ser no passado.");
		}
	}
	private void registerHistoryChange(
		Task task,
		HistoryField field,
		String oldValue,
		String newValue,
		User changedBy,
		String observation
	) {
		TaskHistory h = new TaskHistory();
		h.setTask(task);
		h.setFieldChanged(field);
		h.setOldValue(oldValue);
		h.setNewValue(newValue);
		h.setChangedBy(changedBy);
		h.setObservation(observation);
		h.setChangedAt(LocalDateTime.now());
		
		taskHistoryRepository.save(h);
	}
	
	
}

package com.santt4na.spring_project.mapper;

import com.santt4na.spring_project.dto.TaskHistory.TaskHistoryDTO;
import com.santt4na.spring_project.dto.Tasks.TaskResponseDTO;
import com.santt4na.spring_project.dto.Tasks.TaskUserDTO;
import com.santt4na.spring_project.model.Task;
import com.santt4na.spring_project.model.TaskHistory;
import com.santt4na.spring_project.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskMapper {
	
	public TaskResponseDTO toResponse(Task task) {
		
		TaskUserDTO responsible = task.getResponsibleUser() != null
			? new TaskUserDTO(task.getResponsibleUser().getId(), task.getResponsibleUser().getUsername())
			: null;
		
		List<TaskHistoryDTO> history = task.getHistory()
			.stream()
			.map(this::toHistoryDTO)
			.toList();
		
		return new TaskResponseDTO(
			task.getId(),
			task.getTitle(),
			task.getDescription(),
			task.getStatus(),
			task.getPriority(),
			task.getDueDate(),
			task.getCreatedAt(),
			task.getUpdatedAt(),
			responsible,
			history
		);
	}
	
	private TaskHistoryDTO toHistoryDTO(TaskHistory h, User actor) {
		return new TaskHistoryDTO(
			h.getId(),
			h.getFieldChanged(),
			h.getOldValue(),
			h.getNewValue(),
			h.getObservation(),
			h.getChangedAt()
		);
	}
}

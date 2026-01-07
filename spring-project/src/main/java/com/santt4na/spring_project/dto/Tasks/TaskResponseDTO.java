package com.santt4na.spring_project.dto.Tasks;

import com.santt4na.spring_project.dto.TaskHistory.TaskHistoryDTO;
import com.santt4na.spring_project.enums.Priority;
import com.santt4na.spring_project.enums.Status;
import java.time.LocalDateTime;
import java.util.List;

public record TaskResponseDTO(
	Long id,
	String title,
	String description,
	Status status,
	Priority priority,
	LocalDateTime dueDate,
	LocalDateTime createdAt,
	LocalDateTime updatedAt,
	TaskUserDTO responsibleUser,
	List<TaskHistoryDTO> history
) {}
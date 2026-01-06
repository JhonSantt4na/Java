package com.santt4na.spring_project.dto.Tasks;

import com.santt4na.spring_project.enums.Priority;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record TaskCreateDTO(
	@NotNull(message = "Title cannot be null.")
	@Size(min = 3, message = "The title must be at least 3 characters long")
	String title,
	
	@Size(max = 2000, message = "The description cannot exceed 2000 characters")
	String description,
	
	@NotNull(message = "Priority cannot be null.")
	Priority priority,
	
	LocalDateTime dueDate,
	Long responsibleUserId
) {}

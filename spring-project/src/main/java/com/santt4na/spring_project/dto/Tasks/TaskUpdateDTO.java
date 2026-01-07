package com.santt4na.spring_project.dto.Tasks;

import com.santt4na.spring_project.enums.Priority;
import com.santt4na.spring_project.enums.Status;
import java.time.LocalDateTime;

public record TaskUpdateDTO(
	String title,
	String description,
	Priority priority
) {}
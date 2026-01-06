package com.santt4na.spring_project.dto.TaskHistory;
import com.santt4na.spring_project.enums.HistoryField;

public record TaskHistoryCreateDTO(
	Long taskId,
	Long changedByUserId,
	HistoryField fieldChanged,
	String oldValue,
	String newValue,
	String observation
) {}
package com.santt4na.spring_project.dto.TaskHistory;

import com.santt4na.spring_project.dto.UserSummaryDTO;
import com.santt4na.spring_project.enums.HistoryField;
import java.time.LocalDateTime;

public record TaskHistoryResponseDTO(
	Long id,
	HistoryField fieldChanged,
	String oldValue,
	String newValue,
	String observation,
	LocalDateTime changedAt,
	UserSummaryDTO changedBy
) {}
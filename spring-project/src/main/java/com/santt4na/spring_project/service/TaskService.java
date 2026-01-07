package com.santt4na.spring_project.service;

import com.santt4na.spring_project.dto.Tasks.TaskCreateDTO;
import com.santt4na.spring_project.dto.Tasks.TaskResponseDTO;
import com.santt4na.spring_project.dto.Tasks.TaskUpdateDTO;
import com.santt4na.spring_project.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskService {
	
	TaskResponseDTO createTask(TaskCreateDTO dto) throws Exception;
	TaskResponseDTO updateTask(Long taskId, TaskUpdateDTO dto) throws Exception;
	TaskResponseDTO updateStatus(Long taskId, Status newStatus, Long changedByUserId);
	TaskResponseDTO assignResponsibleUser(Long taskId, Long userId, Long changedByUserId);
	TaskResponseDTO updateDueDate(Long taskId, LocalDateTime newDueDate, Long changedByUserId);
	TaskResponseDTO findById(Long actorId, Long id);
	List<TaskResponseDTO> listAll();
	void deleteTask(Long id, Long changedByUserId);
}
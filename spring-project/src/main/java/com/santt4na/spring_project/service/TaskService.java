package com.santt4na.spring_project.service;

import com.santt4na.spring_project.dto.Tasks.TaskCreateDTO;
import com.santt4na.spring_project.dto.Tasks.TaskUpdateDTO;
import com.santt4na.spring_project.enums.Status;
import com.santt4na.spring_project.model.Task;
import java.time.LocalDateTime;
import java.util.List;

public interface TaskService {
	
	Task createTask(TaskCreateDTO dto) throws Exception;
	Task updateTask(Long taskId, TaskUpdateDTO dto);
	Task updateStatus(Long taskId, Status newStatus, Long changedByUserId);
	Task assignResponsibleUser(Long taskId, Long userId, Long changedByUserId);
	Task updateDueDate(Long taskId, LocalDateTime newDueDate, Long changedByUserId);
	Task findById(Long id);
	List<Task> listAll();
	void deleteTask(Long id, Long changedByUserId);
}
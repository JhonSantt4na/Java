package com.santt4na.spring_project.service.impl;

import com.santt4na.spring_project.dto.TaskHistory.TaskHistoryResponseDTO;
import com.santt4na.spring_project.dto.Tasks.TaskCreateDTO;
import com.santt4na.spring_project.dto.Tasks.TaskUpdateDTO;
import com.santt4na.spring_project.enums.HistoryField;
import com.santt4na.spring_project.enums.Priority;
import com.santt4na.spring_project.enums.Status;
import com.santt4na.spring_project.exceptions.BusinessException;
import com.santt4na.spring_project.exceptions.NotFoundException;
import com.santt4na.spring_project.model.Task;
import com.santt4na.spring_project.model.TaskHistory;
import com.santt4na.spring_project.model.User;
import com.santt4na.spring_project.repository.TaskHistoryRepository;
import com.santt4na.spring_project.repository.TaskRepository;
import com.santt4na.spring_project.repository.UserRepository;
import com.santt4na.spring_project.service.TaskService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.*;

@Service
public class TaskServiceImpl implements TaskService {
	
	private final UserRepository userRepository;
	private final TaskRepository taskRepository;
	private final TaskHistoryRepository taskHistoryRepository;
	
	public TaskServiceImpl(UserRepository userRepository, TaskRepository taskRepository, TaskHistoryRepository taskHistoryRepository) {
		this.userRepository = userRepository;
		this.taskRepository = taskRepository;
		this.taskHistoryRepository = taskHistoryRepository;
	}
	
	@Override
	@Transactional
	public Task createTask(TaskCreateDTO dto) throws Exception {
		
		LocalDateTime now  = LocalDateTime.now();
		Task newTask = new Task();
		User userResponsible = userRepository.findById(dto.responsibleUserId())
			.orElseThrow(() -> new NotFoundException("User not found."));
		
		if (dto.dueDate() == null || dto.dueDate().isBefore(now)) {
			throw new BusinessException("Invalid task deadline.");
		}
		
		if (userResponsible.getQtyTask() >= 5) {
			throw new BusinessException("User has already reached the limit of 5 tasks.");
		}
		
		newTask.setTitle(dto.title());
		newTask.setDescription(dto.description());
		newTask.setResponsibleUser(userResponsible);
		newTask.setStatus(Status.TODO);
		newTask.setDueDate(dto.dueDate());
		
		Task savedTask = taskRepository.save(newTask);
		TaskHistory newTaskHistory = new TaskHistory(
			savedTask,
			userResponsible,
			HistoryField.RESPONSIBLE_USER,
			null,
			"TASK_CREATED",
			"New Task Created",
			now
		);
		TaskHistory savedTaskHistory = taskHistoryRepository.save(newTaskHistory);
		
		return savedTask;
	}
	
	@Override
	public Task updateTask(Long taskId, TaskUpdateDTO dto) {
		return null;
	}
	
	@Override
	public Task updateStatus(Long taskId, Status newStatus, Long changedByUserId) {
		return null;
	}
	
	@Override
	public Task assignResponsibleUser(Long taskId, Long userId, Long changedByUserId) {
		return null;
	}
	
	@Override
	public Task updateDueDate(Long taskId, LocalDateTime newDueDate, Long changedByUserId) {
		return null;
	}
	
	@Override
	public Task findById(Long id) {
		return null;
	}
	
	@Override
	public List<Task> listAll() {
		return List.of();
	}
	
	@Override
	public void deleteTask(Long id, Long changedByUserId) {
	
	}
}

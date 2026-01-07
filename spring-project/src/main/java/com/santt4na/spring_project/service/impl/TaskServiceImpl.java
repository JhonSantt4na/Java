package com.santt4na.spring_project.service.impl;

import com.santt4na.spring_project.dto.TaskHistory.TaskHistoryDTO;
import com.santt4na.spring_project.dto.Tasks.TaskCreateDTO;
import com.santt4na.spring_project.dto.Tasks.TaskResponseDTO;
import com.santt4na.spring_project.dto.Tasks.TaskUpdateDTO;
import com.santt4na.spring_project.dto.Tasks.TaskUserDTO;
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
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Service
public class TaskServiceImpl implements TaskService {
	
	private final UserRepository userRepository;
	private final TaskRepository taskRepository;
	private final TaskHistoryRepository taskHistoryRepository;
	
	public TaskServiceImpl(
		UserRepository userRepository,
		TaskRepository taskRepository,
		TaskHistoryRepository taskHistoryRepository
	) {
		this.userRepository = userRepository;
		this.taskRepository = taskRepository;
		this.taskHistoryRepository = taskHistoryRepository;
	}
	
	@Override
	@Transactional
	public TaskResponseDTO createTask(TaskCreateDTO dto) {
		
		LocalDateTime now = LocalDateTime.now();
		User userResponsible = userRepository.findById(dto.responsibleUserId())
			.orElseThrow(() -> new NotFoundException("User not found."));
		
		if (dto.dueDate() == null || dto.dueDate().isBefore(now)) {
			throw new BusinessException("Invalid task deadline.");
		}
		
		if (userResponsible.getQtyTask() >= 5) {
			throw new BusinessException("User has already reached the limit of 5 tasks.");
		}
		
		Task newTask = new Task();
		newTask.setTitle(dto.title());
		newTask.setDescription(dto.description());
		newTask.setResponsibleUser(userResponsible);
		newTask.setStatus(Status.TODO);
		newTask.setDueDate(dto.dueDate());
		
		Task savedTask = taskRepository.save(newTask);
		
		TaskHistory history = new TaskHistory(
			savedTask,
			userResponsible,
			HistoryField.RESPONSIBLE_USER,
			null,
			"TASK_CREATED",
			"New Task Created",
			now
		);
		
		taskHistoryRepository.save(history);
		
		return mapToTaskResponseDTO(savedTask);
	}
	
	@Override
	@Transactional
	public TaskResponseDTO updateTask(Long taskId, TaskUpdateDTO dto) {
		
		Task task = taskRepository.findById(taskId)
			.orElseThrow(() -> new NotFoundException("Task not found: " + taskId));
		
		User actor = task.getResponsibleUser();
		
		if (dto.title() != null && !dto.title().isBlank()) {
			String newValue = dto.title().trim();
			
			if (!Objects.equals(task.getTitle(), newValue)) {
				registerHistoryChange(task, HistoryField.TITLE, task.getTitle(), newValue, actor);
				task.setTitle(newValue);
			}
		}
		
		if (dto.description() != null) {
			if (!Objects.equals(task.getDescription(), dto.description())) {
				registerHistoryChange(task, HistoryField.DESCRIPTION, task.getDescription(), dto.description(), actor);
				task.setDescription(dto.description());
			}
		}
		
		if (dto.priority() != null) {
			
			String oldValue = task.getPriority() != null ? task.getPriority().name() : null;
			String newValue = dto.priority().name();
			
			if (!Objects.equals(oldValue, newValue)) {
				registerHistoryChange(task, HistoryField.PRIORITY, oldValue, newValue, actor);
				task.setPriority(dto.priority());
			}
			
			if (newValue == Priority.CRITICAL.toString() && task.getDescription() == null) {
				registerHistoryChange(task, HistoryField.PRIORITY, oldValue, newValue, actor);
				task.setPriority(dto.priority());
			}
		}
		
		taskRepository.save(task);
		return mapToTaskResponseDTO(task);
	}
	
	@Override
	@Transactional
	public TaskResponseDTO assignResponsibleUser(Long taskId, Long userId, Long changedByUserId) {
		
		Task task = taskRepository.findById(taskId)
			.orElseThrow(() -> new NotFoundException("Task not found: " + taskId));
		
		User actor = userRepository.findById(changedByUserId)
			.orElseThrow(() -> new NotFoundException("User not found."));
		
		User newResponsible = userRepository.findById(userId)
			.orElseThrow(() -> new NotFoundException("User Responsible not found."));
		
		if (task.getResponsibleUser() != null
			&& !Objects.equals(actor.getId(), newResponsible.getId())) {
			
			registerHistoryChange(
				task,
				HistoryField.RESPONSIBLE_USER,
				task.getResponsibleUser().getUsername(),
				newResponsible.getUsername(),
				actor
			);
			
			task.setResponsibleUser(newResponsible);
		}
		
		return mapToTaskResponseDTO(task);
	}
	
	@Override
	@Transactional
	public TaskResponseDTO updateDueDate(Long taskId, LocalDateTime newDueDate, Long changedByUserId) {
		
		LocalDateTime now = LocalDateTime.now();
		
		Task task = taskRepository.findById(taskId)
			.orElseThrow(() -> new NotFoundException("Task not found: " + taskId));
		
		if (newDueDate != null && newDueDate.isBefore(now)) {
			throw new BusinessException("Invalid task deadline.");
		}
		
		task.setDueDate(newDueDate);
		
		return mapToTaskResponseDTO(task);
	}
	
	@Override
	public TaskResponseDTO findById(Long actorId, Long taskId) {
		
		Task task = taskRepository.findById(taskId)
			.orElseThrow(() -> new NotFoundException("Task not found: " + taskId));
		
		return mapToTaskResponseDTO(task);
	}
	
	@Override
	@Transactional
	public TaskResponseDTO updateStatus(Long taskId, Status newStatus, Long changedByUserId) {
		
		Task task = taskRepository.findById(taskId)
			.orElseThrow(() -> new NotFoundException("Task not found."));
		
		User userChanged = userRepository.findById(changedByUserId)
			.orElseThrow(() -> new NotFoundException("User not found."));
		
		Status statusCurrent = task.getStatus();
		
		if (statusCurrent == Status.DONE) {
			registerHistoryChange(
				task,
				HistoryField.STATUS,
				statusCurrent.toString(),
				newStatus.toString(),
				userChanged
			);
			throw new BusinessException("Task already completed.");
		}
		
		if (statusCurrent == Status.TODO && newStatus == Status.DONE) {
			registerHistoryChange(
				task,
				HistoryField.STATUS,
				statusCurrent.toString(),
				newStatus.toString(),
				userChanged
			);
			throw new BusinessException("Status can't go at all to done.");
		}
		
		task.setStatus(newStatus);
		taskRepository.save(task);
		
		registerHistoryChange(
			task,
			HistoryField.STATUS,
			statusCurrent.toString(),
			newStatus.toString(),
			userChanged
		);
		
		return mapToTaskResponseDTO(task);
	}
	
	@Override
	public List<TaskResponseDTO> listAll() {
		
		TaskHistory history = new TaskHistory(
			null,
			null,
			HistoryField.RESPONSIBLE_USER,
			null,
			"LIST_ALL_TASKS",
			"List All Tasks",
			LocalDateTime.now()
		);
		
		return taskRepository.findAll()
			.stream()
			.map(this::mapToTaskResponseDTO)
			.toList();
	}
	
	@Override
	public void deleteTask(Long id, Long changedByUserId) {
		
		Task task = taskRepository.findById(id)
			.orElseThrow(() -> new NotFoundException("Task not found."));
		
		User userChanged = userRepository.findById(changedByUserId)
			.orElseThrow(() -> new NotFoundException("User not found"));
		
		registerHistoryChange(
			task,
			HistoryField.RESPONSIBLE_USER,
			null,
			"DELETE_TASK",
			userChanged
		);
	}
	
	private TaskResponseDTO mapToTaskResponseDTO(Task task) {
		
		TaskUserDTO responsibleDTO =
			task.getResponsibleUser() != null
				? new TaskUserDTO(
				task.getResponsibleUser().getId(),
				task.getResponsibleUser().getUsername()
			)
				: null;
		
		List<TaskHistoryDTO> historyDTOs = task.getHistory()
			.stream()
			.map(this::mapHistoryToDTO)
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
			responsibleDTO,
			historyDTOs
		);
	}
	
	private TaskHistoryDTO mapHistoryToDTO(TaskHistory h) {
		return new TaskHistoryDTO(
			h.getId(),
			h.getFieldChanged(),
			h.getOldValue(),
			h.getNewValue(),
			h.getChangedBy() != null ? h.getChangedBy().getUsername() : null,
			h.getChangedAt()
		);
	}
	
	private void registerHistoryChange(
		Task task,
		HistoryField field,
		String oldValue,
		String newValue,
		User changedBy
	) {
		TaskHistory history = new TaskHistory();
		history.setTask(task);
		history.setFieldChanged(field);
		history.setOldValue(oldValue);
		history.setNewValue(newValue);
		history.setChangedBy(changedBy);
		history.setObservation("UPDATED FIELD");
		history.setChangedAt(LocalDateTime.now());
		
		taskHistoryRepository.save(history);
	}
	
	private TaskResponseDTO findTask(Long id) {
		Task task = taskRepository.findById(id)
			.orElseThrow(() -> new BusinessException("Task não encontrada."));
		return mapToTaskResponseDTO(task);
	}
	
	private User findUser(Long id) {
		return userRepository.findById(id)
			.orElseThrow(() -> new BusinessException("Usuário não encontrado."));
	}
}

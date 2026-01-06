package com.santt4na.spring_project.repository;

import com.santt4na.spring_project.enums.Status;
import com.santt4na.spring_project.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	List<Task> findByResponsibleUserId(Long userId);
	List<Task> findByStatus(Status status);
	List<Task> findByDueDateBefore(LocalDateTime date);
	List<Task> findByResponsibleUserIdAndStatus(Long userId, Status status);
}
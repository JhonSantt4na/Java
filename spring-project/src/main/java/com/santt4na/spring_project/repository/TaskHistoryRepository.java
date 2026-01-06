package com.santt4na.spring_project.repository;

import com.santt4na.spring_project.model.TaskHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskHistoryRepository extends JpaRepository<TaskHistory, Long> {
	List<TaskHistory> findByTaskIdOrderByChangedAtDesc(Long taskId);
}
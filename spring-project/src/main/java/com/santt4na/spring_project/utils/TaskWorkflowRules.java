package com.santt4na.spring_project.utils;

import com.santt4na.spring_project.enums.Status;
import org.springframework.stereotype.Component;

import static com.santt4na.spring_project.enums.Status.TODO;

@Component
public class TaskWorkflowRules {
	
	public boolean isTransitionAllowed(Status from, Status to) {
		
		return switch (from) {
			case TODO -> to == Status.IN_PROGRESS;
			case IN_PROGRESS -> to == Status.BLOCKED || to == Status.DONE;
			case BLOCKED -> to == Status.IN_PROGRESS;
			case DONE -> false;
		};
	}
}

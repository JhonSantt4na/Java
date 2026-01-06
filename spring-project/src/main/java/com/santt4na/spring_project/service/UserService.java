package com.santt4na.spring_project.service;

import com.santt4na.spring_project.model.User;
import java.util.Optional;

public interface UserService {
	User registerUser(String username, String password);
	Optional<User> findUserByUsername(String username);
}
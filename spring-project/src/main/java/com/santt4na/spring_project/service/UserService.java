package com.santt4na.spring_project.service;

import com.santt4na.spring_project.model.User;
import com.santt4na.spring_project.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	public User RegisterUser(String username, String password){
		String passwordEncoded = passwordEncoder.encode(password);
		User user = new User(username, passwordEncoded);
		return userRepository.save(user);
	}
	
	public Optional<User> findUserByUsername(String username){
		return userRepository.findByUsername(username);
	}
}
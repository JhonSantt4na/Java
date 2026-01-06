package com.santt4na.spring_project.service.impl;

import com.santt4na.spring_project.model.User;
import com.santt4na.spring_project.repository.UserRepository;
import com.santt4na.spring_project.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	@Override
	public User registerUser(String username, String password) {
		String passwordEncoded = passwordEncoder.encode(password);
		User user = new User(username, passwordEncoded);
		return userRepository.save(user);
	}
	
	public Optional<User> findUserByUsername(String username){
		return userRepository.findByUsername(username);
	}
}
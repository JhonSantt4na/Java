package com.santt4na.Finance.services;

import com.santt4na.Finance.entity.User;
import com.santt4na.Finance.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@Service
@AllArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public User createUser(User user){
		log.info("Create new User");
		
		if (user.getName() == null || user.getEmail() == null || user.getPassword() == null) {
			log.warning("Attempt to create user with null required fields");
			throw new IllegalArgumentException("Name, email and password are required");
		}
		
		User newUser = new User();
		newUser.setName(user.getName());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());
		
		log.info("New Account created");
		return userRepository.save(newUser);
	};
	
	public User getOrFail(Long userId) throws Exception {
		log.info("Get Or Fail User By with Id: " + userId);
		return userRepository.findById(userId)
			.orElseThrow(() -> new Exception("User not found: " + userId));
	};
	
	public void deleteUser(Long userId) throws Exception {
		log.info("Delete User By with Id: " + userId);
		userRepository.delete(getOrFail(userId));
		log.info("User Deleted with Success");
	}
	
}

//Criar usuário
//Buscar usuário
//Garantir que o usuário existe
//(Futuro) autenticação / autorização
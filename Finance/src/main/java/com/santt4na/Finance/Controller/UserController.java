package com.santt4na.Finance.Controller;

import com.santt4na.Finance.entity.User;
import com.santt4na.Finance.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log
@RestController()
@AllArgsConstructor
@RequestMapping("/v1/user")
public class UserController {
	
	private final UserService userService;
	
	@PostMapping()
	public ResponseEntity<User> createUser(@RequestBody @Valid User user){
		log.info("Starting create a new User");
		User newUser = userService.createUser(user);
		log.info("User created successfully");
		return ResponseEntity.ok(newUser);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findUser(@PathVariable Long id) throws Exception {
		log.info("Fetching user by id: " + id);
		User user = userService.getOrFail(id);
		return ResponseEntity.ok(user);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long id) throws Exception {
		log.info("Deleting user with id: " + id);
		userService.deleteUser(id);
		log.info("User deleted successfully. UserId: " + id);
		return ResponseEntity.noContent().build();
	}
	
}
package com.hrsjp.ePrepSpring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrsjp.ePrepSpring.entities.*;
import com.hrsjp.ePrepSpring.services.impl.UserServiceImpliment;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServiceImpliment userServiceImpliment;
	
	@GetMapping("/all-users")
	public ResponseEntity<?> getAllUsers() {
		List<User> users = this.userServiceImpliment.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@GetMapping("/get-user/{userName}")
	public ResponseEntity<?> getUserByUsername(@PathVariable("userName") String userName) {
		User gotUser = this.userServiceImpliment.getUserByUserName(userName);
		System.out.println(gotUser);
		return new ResponseEntity<>(gotUser, HttpStatus.OK);
	}
	
	@PostMapping("/add-user")
	public ResponseEntity<?> addNewUser(@RequestBody User user) {
		User newUser = this.userServiceImpliment.addUser(user);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete-user/{userId}")
	public ResponseEntity<?> deleteUserByUserName(@PathVariable("userId") Long userId) {
		this.userServiceImpliment.deleteUserById(userId);
		Map<String, String> message = new HashMap<>();
		message.put("message", "User deleted successfully!");
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	
}

package com.hrsjp.ePrepSpring.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrsjp.ePrepSpring.entities.Role;
import com.hrsjp.ePrepSpring.entities.User;
import com.hrsjp.ePrepSpring.entities.UserRole;
import com.hrsjp.ePrepSpring.services.impl.UserServiceImpliment;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpliment userServiceImpliment;
	
	// Creating User - End point
	@PostMapping("/")
	public User createUser(@RequestBody User user) {
		Set<UserRole> roles = new HashSet<>();
		
		Role role1 = new Role();
		role1.setRoleId(45L);
		role1.setRoleName("NORMAL");
		
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		
		roles.add(userRole);
		
		return this.userServiceImpliment.saveUser(user, roles);
	}
	
	@GetMapping("/{userName}")
	public User getUserByUserName(@PathVariable("userName") String userName) {
		return this.userServiceImpliment.getUserByUserName(userName);
	}
	
}

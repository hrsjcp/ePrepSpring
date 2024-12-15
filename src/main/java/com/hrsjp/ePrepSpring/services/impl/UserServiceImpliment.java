package com.hrsjp.ePrepSpring.services.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrsjp.ePrepSpring.entities.User;
import com.hrsjp.ePrepSpring.entities.UserRole;
import com.hrsjp.ePrepSpring.repos.RoleRepository;
import com.hrsjp.ePrepSpring.repos.UserRepository;
import com.hrsjp.ePrepSpring.services.UserServiceInterface;

@Service
public class UserServiceImpliment implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

	//	Creating User
	public User saveUser(User user, Set<UserRole> userRoles) {
		
		User localUser = this.userRepository.findUserByUserName(user.getUserName());
		if(localUser != null) {
			System.out.println("User Already Available!");
		} else {
			for (UserRole ur: userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			localUser = this.userRepository.save(user);
		}
		
		return localUser;
	}

	public User getUserByUserName(String userName) {
		return this.userRepository.findUserByUserName(userName);
	}

	public void deleteUserById(Long id) {
		this.userRepository.deleteById(id);
	}

}

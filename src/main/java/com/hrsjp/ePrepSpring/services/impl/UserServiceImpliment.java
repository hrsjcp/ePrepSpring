package com.hrsjp.ePrepSpring.services.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrsjp.ePrepSpring.entities.User;
import com.hrsjp.ePrepSpring.repos.UserRepository;
import com.hrsjp.ePrepSpring.services.UserServiceInterface;

@Service
public class UserServiceImpliment implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

	@Override
	public User getUserByUserName(String userName) {
		return this.userRepository.findUserByUserName(userName);
	}

	@Override
	public User addUser(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long userId) {
		this.userRepository.deleteById(userId);
	}



}

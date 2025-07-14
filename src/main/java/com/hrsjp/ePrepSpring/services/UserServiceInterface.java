package com.hrsjp.ePrepSpring.services;

import java.util.List;
import java.util.Set;

import com.hrsjp.ePrepSpring.entities.*;

public interface UserServiceInterface {
	
	public List<User> getAllUsers();
	
	public User getUserByUserName(String userName);
	
	public void deleteUserById(Long userId);
	
	public User addUser(User user);
	
	public User updateUser(User user);

}

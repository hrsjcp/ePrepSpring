package com.hrsjp.ePrepSpring.services;

import java.util.List;
import java.util.Set;

import com.hrsjp.ePrepSpring.entities.User;
import com.hrsjp.ePrepSpring.entities.UserRole;

public interface UserServiceInterface {
	
	public List<User> getAllUsers();
	
	public User saveUser(User user, Set<UserRole> userRoles);
	
	public User getUserByUserName(String userName);
	
	public void deleteUserById(Long id);

}

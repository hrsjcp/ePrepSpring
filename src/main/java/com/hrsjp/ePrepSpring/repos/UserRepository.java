package com.hrsjp.ePrepSpring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrsjp.ePrepSpring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findUserByUserName(String userName);

}

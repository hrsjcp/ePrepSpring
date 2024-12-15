package com.hrsjp.ePrepSpring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrsjp.ePrepSpring.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

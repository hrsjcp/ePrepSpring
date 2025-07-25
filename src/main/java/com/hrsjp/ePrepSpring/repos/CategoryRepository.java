package com.hrsjp.ePrepSpring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrsjp.ePrepSpring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

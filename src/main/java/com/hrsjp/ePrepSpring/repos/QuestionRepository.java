package com.hrsjp.ePrepSpring.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrsjp.ePrepSpring.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}

package com.pankaj28843.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pankaj28843.quiz.models.Question;

@Repository("questionRepository")
public interface QuestionRepository extends JpaRepository<Question, Long> {

}

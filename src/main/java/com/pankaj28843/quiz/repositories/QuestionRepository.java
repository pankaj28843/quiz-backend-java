package com.pankaj28843.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pankaj28843.quiz.models.Question;

public interface  QuestionRepository extends JpaRepository<Question, Long>{

}

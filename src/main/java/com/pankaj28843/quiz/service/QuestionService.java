package com.pankaj28843.quiz.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.pankaj28843.quiz.models.Choice;
import com.pankaj28843.quiz.models.Question;
import com.pankaj28843.quiz.repositories.ChoiceRepository;
import com.pankaj28843.quiz.repositories.QuestionRepository;

@Service
@Transactional
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private ChoiceRepository choiceRepository;

	public List<Question> findAll() {
		return questionRepository.findAll();
	}

	public Question getById(Long id) {
		return questionRepository.getOne(id);
	}

	public void setChoices(Question question, List<Choice> newChoices) {
		choiceRepository.deleteAll(question.getChoices());

		for (Choice newChoice : newChoices) {
			newChoice.setQuestion(question);
		}
		
		choiceRepository.saveAll(newChoices);
	}

	@Modifying
	public void save(Question question) {
		questionRepository.save(question);
	}

}

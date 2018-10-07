package com.pankaj28843.quiz.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "question_choices")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Choice {
	private String choiceText;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Boolean isCorrect;

	@ManyToOne
	@JoinColumn(name = "question_id")
	@JsonIgnore
	private Question question;

	public String getChoiceText() {
		return choiceText;
	}

	public Long getId() {
		return id;
	}

	public Boolean getIsCorrect() {
		return isCorrect;
	}

	public Question getQuestion() {
		return question;
	}

	public void setChoiceText(String choiceText) {
		this.choiceText = choiceText;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}

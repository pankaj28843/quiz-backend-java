package com.pankaj28843.quiz.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String question;
	private Boolean isPublished;
	private Integer maximumMarks;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Boolean getIsPublished() {
		return isPublished;
	}

	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	public Integer getMaximumMarks() {
		return maximumMarks;
	}

	public void setMaximumMarks(Integer maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

}

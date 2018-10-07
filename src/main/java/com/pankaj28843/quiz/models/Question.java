package com.pankaj28843.quiz.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "questions")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Question {

	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH, CascadeType.REMOVE }, orphanRemoval = true)
	private List<Choice> choices = new ArrayList<Choice>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Boolean isPublished;
	private Integer maximumMarks;

	private String questionText;

	public List<Choice> getChoices() {
		return choices;
	}

	public Long getId() {
		return id;
	}

	public Boolean getIsPublished() {
		return isPublished;
	}

	public Integer getMaximumMarks() {
		return maximumMarks;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	public void setMaximumMarks(Integer maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

}

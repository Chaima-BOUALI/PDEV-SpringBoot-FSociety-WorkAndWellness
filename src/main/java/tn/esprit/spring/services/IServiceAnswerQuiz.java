package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.AnswerQuiz;

public interface IServiceAnswerQuiz {
	List<AnswerQuiz> retrieveAllAnswers();

	AnswerQuiz addAnswerQuiz (AnswerQuiz aq);

	void deleteAnswerQuiz (int id);

	AnswerQuiz updateAnswerQuiz(AnswerQuiz aq);

	AnswerQuiz retrieveAnswerQuiz(int id);
}

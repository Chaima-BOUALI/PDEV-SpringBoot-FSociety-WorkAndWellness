package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.QuestionsQuiz;

public interface IServiceQuestionsQuiz {
	List<QuestionsQuiz> retrieveAllQuestionsQuiz();

	QuestionsQuiz addQuestionsQuiz (QuestionsQuiz q);

	void deleteQuestionsQuiz (int id);

	QuestionsQuiz updateQuestionsQuiz (QuestionsQuiz q);

	QuestionsQuiz retrieveQuestionsQuiz (int id);
}

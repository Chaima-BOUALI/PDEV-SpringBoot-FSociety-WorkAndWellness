package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.QuizResults;

public interface IServiceQuizResutls {
	List<QuizResults> retrieveAllQuizResults();

	QuizResults addQuizResults (QuizResults qr);

	void deleteQuizResults (int id);

	QuizResults updateQuizResults (QuizResults qr);

	QuizResults retrieveQuizResults (int id);
}

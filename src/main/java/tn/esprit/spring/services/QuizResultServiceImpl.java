package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.QuizResults;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repositories.QuizResultsRepository;
@Service
public class QuizResultServiceImpl implements IServiceQuizResutls {
@Autowired
QuizResultsRepository quizresultRepository; 
	@Override
	public List<QuizResults> retrieveAllQuizResults() {
		return (List<QuizResults>) quizresultRepository.findAll();
	}

	@Override
	public QuizResults addQuizResults(QuizResults qr) {
		return quizresultRepository.save(qr); 
	}

	@Override
	public void deleteQuizResults(int id) {
quizresultRepository.deleteById(id);
	}

	@Override
	public QuizResults updateQuizResults(QuizResults qr) {
		return quizresultRepository.save(qr);
	}

	@Override
	public QuizResults retrieveQuizResults(int id) {
		QuizResults qr = quizresultRepository.findById(id).get();
		return qr; 
	}

}

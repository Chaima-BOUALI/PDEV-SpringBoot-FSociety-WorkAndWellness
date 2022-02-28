package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.QuestionsQuiz;
import tn.esprit.spring.entities.Quiz;
import tn.esprit.spring.repositories.QuizRepository;

@Service
public class QuizServiceImpl implements IServiceQuiz{
@Autowired
QuizRepository quizRepository; 
	@Override
	public List<Quiz> retrieveAllQuiz() {
		return  (List<Quiz>) quizRepository.findAll();
	}

	@Override
	public Quiz addQuiz(Quiz q) {
		return quizRepository.save(q);
	}

	@Override
	public void deleteQuiz(int id) {
		quizRepository.deleteById(id);		
	}

	@Override
	public Quiz updateQuiz(Quiz q) {
		return quizRepository.save(q);
	}

	@Override
	public Quiz retrieveQuiz(int id) {
		Quiz q = quizRepository.findById(id).get();
		return q;
	}

}

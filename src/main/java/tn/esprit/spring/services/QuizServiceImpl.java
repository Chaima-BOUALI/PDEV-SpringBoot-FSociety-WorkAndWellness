package tn.esprit.spring.services;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.xml.ws.Response;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Quiz;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repositories.QuizRepository;


@Service("QuizService")
@Transactional
public class QuizServiceImpl implements IServiceQuiz {

	private static final Logger logger = LoggerFactory.getLogger(QuizServiceImpl.class);
	private QuizRepository quizRepository;

	private IServiceQuestionsQuiz questionService;

	@Autowired
	public QuizServiceImpl(QuizRepository quizRepository, IServiceQuestionsQuiz questionService) {
		this.quizRepository = quizRepository;
		this.questionService = questionService;
	
	}

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

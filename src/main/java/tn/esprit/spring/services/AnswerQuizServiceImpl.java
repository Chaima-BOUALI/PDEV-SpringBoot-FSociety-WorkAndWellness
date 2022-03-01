package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.AnswerQuiz;
import tn.esprit.spring.repositories.AnswerQuizRepository;

@Service
public class AnswerQuizServiceImpl implements IServiceAnswerQuiz{
@Autowired
AnswerQuizRepository answerQuizRepository;
	@Override
	public List<AnswerQuiz> retrieveAllAnswers() {
		return  (List<AnswerQuiz>) answerQuizRepository.findAll();
	}

	@Override
	public AnswerQuiz addAnswerQuiz(AnswerQuiz aq) {
		return answerQuizRepository.save(aq);
	}

	@Override
	public void deleteAnswerQuiz(int id) {
answerQuizRepository.deleteById(id);		
	}

	@Override
	public AnswerQuiz updateAnswerQuiz(AnswerQuiz aq) {
		return answerQuizRepository.save(aq);
	}

	@Override
	public AnswerQuiz retrieveAnswerQuiz(int id) {
		AnswerQuiz aq = answerQuizRepository.findById(id).get();
return aq;
	}

}

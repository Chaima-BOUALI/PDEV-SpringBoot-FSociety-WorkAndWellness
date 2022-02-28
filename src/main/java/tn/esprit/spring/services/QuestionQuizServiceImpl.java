package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.QuestionsQuiz;
import tn.esprit.spring.repositories.QuestionsQuizRepository;
@Service
public class QuestionQuizServiceImpl implements IServiceQuestionsQuiz{
@Autowired
QuestionsQuizRepository questionsQuizRepository; 
	@Override
	public List<QuestionsQuiz> retrieveAllQuestionsQuiz() {
		return  (List<QuestionsQuiz>) questionsQuizRepository.findAll();

	}

	@Override
	public QuestionsQuiz addQuestionsQuiz(QuestionsQuiz q) {
		return questionsQuizRepository.save(q);

	}

	@Override
	public void deleteQuestionsQuiz(int id) {
		questionsQuizRepository.deleteById(id);		
	}

	@Override
	public QuestionsQuiz updateQuestionsQuiz(QuestionsQuiz q) {
		return questionsQuizRepository.save(q);
	}

	@Override
	public QuestionsQuiz retrieveQuestionsQuiz(int id) {
		QuestionsQuiz q = questionsQuizRepository.findById(id).get();
		return q;
	}

}

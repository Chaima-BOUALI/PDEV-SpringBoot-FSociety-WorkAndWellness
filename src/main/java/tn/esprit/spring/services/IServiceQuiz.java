package tn.esprit.spring.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tn.esprit.spring.entities.Quiz;

public interface IServiceQuiz {
	List<Quiz> retrieveAllQuiz();

	Quiz addQuiz (Quiz q);

	void deleteQuiz (int id);

	Quiz updateQuiz (Quiz q);

	Quiz retrieveQuiz (int id);
}

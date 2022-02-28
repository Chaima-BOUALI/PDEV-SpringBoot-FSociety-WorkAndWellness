package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.QuestionsQuiz;
@Repository
public interface QuestionsQuizRepository extends CrudRepository<QuestionsQuiz, Integer> {

}

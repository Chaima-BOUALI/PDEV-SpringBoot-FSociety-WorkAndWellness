package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.AnswerQuiz;
@Repository
public interface AnswerQuizRepository extends CrudRepository<AnswerQuiz, Integer> {

}

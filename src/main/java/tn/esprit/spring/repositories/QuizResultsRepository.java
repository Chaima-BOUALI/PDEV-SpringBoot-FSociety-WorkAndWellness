package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.QuizResults;
@Repository
public interface QuizResultsRepository extends CrudRepository<QuizResults, Integer> {

}

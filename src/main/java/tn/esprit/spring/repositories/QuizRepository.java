package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Quiz;
@Repository
public interface QuizRepository extends CrudRepository<Quiz, Integer> {

}

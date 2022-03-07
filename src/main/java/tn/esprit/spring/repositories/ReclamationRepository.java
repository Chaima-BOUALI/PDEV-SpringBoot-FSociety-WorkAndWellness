package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Reclamation;
@Repository
public interface ReclamationRepository extends CrudRepository< Reclamation, Integer> {

}
package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Publication;

public interface PublicationRepository extends CrudRepository<Publication, Integer> {

}

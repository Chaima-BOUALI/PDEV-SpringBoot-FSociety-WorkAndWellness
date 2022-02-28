package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Events;
@Repository
public interface EventRepository extends CrudRepository<Events, Integer> {

}

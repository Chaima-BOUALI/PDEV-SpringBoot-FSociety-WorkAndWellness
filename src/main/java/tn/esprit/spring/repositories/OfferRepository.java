package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Offers;
@Repository
public interface OfferRepository extends CrudRepository<Offers, Integer> {

}

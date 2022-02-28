package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Partnership;
@Repository
public interface PartnershipRepository extends CrudRepository<Partnership, Integer> {

}

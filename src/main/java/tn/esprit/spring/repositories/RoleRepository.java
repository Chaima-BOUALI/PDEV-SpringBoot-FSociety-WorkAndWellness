package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}

package tn.esprit.spring.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.RoleName;
import tn.esprit.spring.entities.User;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
 //Role findByRoleName (RoleName role);
	//Role findByRoleName (String RoleName);

}

package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.AnswerQuiz;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IServiceRole;

@EnableSwagger2
@Api(tags = "Roles Management")
@RestController
@RequestMapping("/Roles_Management")
public class RoleController {
@Autowired
IServiceRole roleservice; 
@GetMapping("/ShowRoles/{Role-id}")
@ResponseBody
public Role retrieveRole(@PathVariable("Role-id") int idRole ) {
return roleservice.retrieveRoles(idRole);
}
@PostMapping("/add-Role")
@ResponseBody
public Role addRole(@RequestBody Role r)
{
	Role role= roleservice.addRoles(r);
return role;
}
@DeleteMapping("/remove-roles/{Roles-id}")
@ResponseBody
public void removeRoles(@PathVariable("Roles-id") int idRole) {
roleservice.deleteRoles(idRole);
}

@PutMapping("/modify-roles")
@ResponseBody
public Role modifyRole(@RequestBody Role roles) {
return roleservice.updateRoles(roles);
}
}

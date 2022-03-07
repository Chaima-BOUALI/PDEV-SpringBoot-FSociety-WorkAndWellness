package tn.esprit.spring.controllers;

import java.util.List;

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
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IServiceUser;

@EnableSwagger2
@RestController
@Api(tags = "Users Management")
@RequestMapping("/user")
public class UserController {


	@Autowired
	IServiceUser serviceUser; 
@ResponseBody
@GetMapping("/showUser")
public List<User> getUsers() {
	List<User> listUsers = serviceUser.retrieveAllUsers();
return listUsers;
}

@GetMapping("/showuser/{user-id}")
@ResponseBody
public User retrieveUser(@PathVariable("user-id") int idUser) {
return serviceUser.retrieveUser(idUser);
}


@PostMapping("/add-user")
@ResponseBody
public User addUser(@RequestBody User u)
{
User user= serviceUser.addUser(u);
return user;
}




@DeleteMapping("/remove-user/{user-id}")
@ResponseBody
public void removeUser(@PathVariable("user-id") int idUser) {
	serviceUser.deleteUser(idUser);
}

@PutMapping("/modify-user")
@ResponseBody
public User modifyUser(@RequestBody User user) {
return serviceUser.updateUser(user);
}
}
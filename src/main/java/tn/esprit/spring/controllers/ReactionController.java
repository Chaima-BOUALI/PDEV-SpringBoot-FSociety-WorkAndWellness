package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.AnswerQuiz;
import tn.esprit.spring.entities.Reaction;
import tn.esprit.spring.services.IServiceReaction;

@EnableSwagger2
@RestController
@RequestMapping("/Reactions_Management")
public class ReactionController {
@Autowired
IServiceReaction serviceReaction;
@GetMapping("/showReactions/{Reaction-id}")
@ResponseBody
public Reaction retrieveReaction(@PathVariable("Reaction-id") int idReaction ) {
return serviceReaction.retrieveReaction(idReaction);
}
@PostMapping("/add-reaction")
@ResponseBody
public Reaction addReaction(@RequestBody Reaction r)
{
	Reaction react= serviceReaction.addReaction(r);
return react;
}
@DeleteMapping("/remove-reaction/{reaction-id}")
@ResponseBody
public void removeReaction(@PathVariable("reaction-id") int idReaction) {
serviceReaction.deleteReaction(idReaction);
}

}

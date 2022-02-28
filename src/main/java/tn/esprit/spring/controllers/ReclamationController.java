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

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.AnswerQuiz;
import tn.esprit.spring.entities.Reclamation;
import tn.esprit.spring.services.IServiceReclamation;

@EnableSwagger2
@RestController
@RequestMapping("/Reclamations")
public class ReclamationController {
@Autowired
IServiceReclamation serviceReclamation; 
@GetMapping("/ShowReclamations/{Reclamation-id}")
@ResponseBody
public Reclamation retrieveReclamation(@PathVariable("Reclamation-id") int idReclamation ) {
return serviceReclamation.retrieveReclamation(idReclamation);
}
@PostMapping("/add-reclamations")
@ResponseBody
public Reclamation addReclamation(@RequestBody Reclamation r)
{
	Reclamation reclamations = serviceReclamation.addReclamation(r);
return reclamations;
}
@DeleteMapping("/remove-reclamation/{reclamation-id}")
@ResponseBody
public void removeReclamations(@PathVariable("reclamation-id") int idReclamation) {
serviceReclamation.deleteReclamation(idReclamation);
}
@PutMapping("/modify-reclamations")
@ResponseBody
public Reclamation modifyReclamation(@RequestBody Reclamation reclamations) {
return serviceReclamation.updateReclamation(reclamations);
}

}

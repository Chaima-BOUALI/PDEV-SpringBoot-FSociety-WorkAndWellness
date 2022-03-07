package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.Subjects;
import tn.esprit.spring.services.IServiceSubjects;

@EnableSwagger2
@Api(tags = "Subjects Management")
@RestController
@RequestMapping("/Subjects")
public class SubjectsController {
@Autowired
IServiceSubjects subjectsservice; 
@GetMapping("/Showsubjects/{subjects-id}")
@ResponseBody
public Subjects retrieveSubjects (@PathVariable("subjects-id") int idSubjects ) {
return subjectsservice.retrieveSubjects(idSubjects);
}
@PostMapping("/add-subjects")
@ResponseBody
public Subjects addSubjects(@RequestBody Subjects s)
{
	Subjects sub= subjectsservice.addSubjects(s);
return sub;
}
}

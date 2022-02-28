package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.AnswerQuiz;
import tn.esprit.spring.entities.QuizResults;
import tn.esprit.spring.services.IServiceQuizResutls;

@EnableSwagger2
@RestController
@RequestMapping("/Quiz_Results")
public class QuizResultController {
@Autowired
IServiceQuizResutls serviceQuizResutls; 
@GetMapping("/ShowQuizResults/{QuizResults-id}")
@ResponseBody
public QuizResults retrieveQuizResults(@PathVariable("QuizResult-id") int idQuizresults ) {
return serviceQuizResutls.retrieveQuizResults (idQuizresults);
}
}

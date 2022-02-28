package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.AnswerQuiz;
import tn.esprit.spring.services.IServiceAnswerQuiz;

@EnableSwagger2
@RestController
@RequestMapping("/AnswerQuiz")
public class AnswerQuizController {
@Autowired
IServiceAnswerQuiz answerQuiz; 
@ResponseBody
@GetMapping("/ShowAnswers")
public List<AnswerQuiz> getAnswers() {
List<AnswerQuiz> listAnswers = answerQuiz.retrieveAllAnswers();
return listAnswers;
}
}

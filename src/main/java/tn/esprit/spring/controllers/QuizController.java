package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.Quiz;
import tn.esprit.spring.services.IServiceQuiz;

@EnableSwagger2
@Api(tags = "Quiz Management")
@RestController
@RequestMapping("/Quiz")
public class QuizController {
	@Autowired
	IServiceQuiz iServiceQuiz; 
	@PostMapping("/add-quiz")
	@ResponseBody
	public Quiz addQuiz(@RequestBody Quiz q)
	{
		Quiz quiz= iServiceQuiz.addQuiz(q);
		return quiz;
	}
	@DeleteMapping("/remove-quiz/{Quiz-id}")
	@ResponseBody
	public void removeQuizes(@PathVariable("Quiz-id") int idQuiz) {
		iServiceQuiz.deleteQuiz(idQuiz);
	}
}

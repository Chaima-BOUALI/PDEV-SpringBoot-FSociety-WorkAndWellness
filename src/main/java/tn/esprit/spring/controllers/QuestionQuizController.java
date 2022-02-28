package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.AnswerQuiz;
import tn.esprit.spring.entities.QuestionsQuiz;
import tn.esprit.spring.services.IServiceAnswerQuiz;
import tn.esprit.spring.services.IServiceQuestionsQuiz;

@EnableSwagger2
@RestController
@RequestMapping("/QuestionsQuiz")
public class QuestionQuizController {
	@Autowired
	IServiceQuestionsQuiz iServiceQuestionsQuiz;
	@ResponseBody
	@GetMapping("/ShowAnswers")
	public List<QuestionsQuiz> getQuestions() {
	List<QuestionsQuiz> listQuestions = iServiceQuestionsQuiz.retrieveAllQuestionsQuiz();
	return listQuestions;
	}
}

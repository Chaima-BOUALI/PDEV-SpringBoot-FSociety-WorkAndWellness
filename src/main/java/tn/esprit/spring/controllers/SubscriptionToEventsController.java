package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tn.esprit.spring.entities.AnswerQuiz;
import tn.esprit.spring.entities.EventSubscription;
import tn.esprit.spring.services.IServiceEventSubscription;
@EnableSwagger2
@RestController
@RequestMapping("/EventSubscription")
public class SubscriptionToEventsController {
	@Autowired
	IServiceEventSubscription eventsubService; 
	@GetMapping("/ShowEventSubscriptions/{EventSubscriptions-id}")
	@ResponseBody
	public EventSubscription retrieveEventSubscription(@PathVariable("EventSubscription-id") int idEventSubscription ) {
	return eventsubService.retrieveEventSubscription(idEventSubscription);
	}
	@PostMapping("/add-eventSub")
	@ResponseBody
	public EventSubscription addEventSubscription(@RequestBody EventSubscription e)
	{
		EventSubscription subToEvents= eventsubService.addEventSubscription(e);
	return subToEvents;
	}
}

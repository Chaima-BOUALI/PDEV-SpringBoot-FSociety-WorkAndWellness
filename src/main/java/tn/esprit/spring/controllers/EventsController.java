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
import tn.esprit.spring.entities.Events;
import tn.esprit.spring.services.IServiceEvents;
import tn.esprit.spring.services.IServiceUser;

@EnableSwagger2
@Api(tags = "Events Management")
@RestController
@RequestMapping("/events")
public class EventsController {
@Autowired
IServiceEvents serviceEvents;
IServiceUser iServiceUser; 




@PostMapping("/add-events")
@ResponseBody
public Events addEvents(@RequestBody Events e)
{
Events events =  serviceEvents.addEvents(e);
return e;
}
@DeleteMapping("/remove-event/{event-id}")
@ResponseBody
public void removeArticle(@PathVariable("event-id") int idEvent) {
	serviceEvents.deleteEvents(idEvent);
}

@ResponseBody
@GetMapping("/showEvents")
public  List<Events> getEvents() {
	List<Events> listEvent = serviceEvents.retrieveAllEvents();
return listEvent;
}
@GetMapping("/showevent/{event-id}")
@ResponseBody
public Events retrieveArticles(@PathVariable("event-id") int idEvent) {
return serviceEvents.retrieveEvents(idEvent);
}
@PutMapping("/modify-event")
@ResponseBody
public Events modifyEvents(@RequestBody Events e) {
return serviceEvents.updateEvents(e);
}
@PostMapping("/add-events/{id-users}")
public void AddAndAffect(@RequestBody List<Events> le, @PathVariable("id-user") Integer idUser){
	iServiceUser.AddAndAffect(le,idUser);
}
}


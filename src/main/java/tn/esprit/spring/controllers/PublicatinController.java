package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Publication;
import tn.esprit.spring.services.IServicePublication;

@RestController
@RequestMapping("/api/publication")
public class PublicatinController {

	
	@Autowired
	IServicePublication iServicePublication;
	@PostMapping("/add")
	public Publication addPublication(@RequestBody Publication p) {
		return iServicePublication.addPublication(p);
		
	}
}

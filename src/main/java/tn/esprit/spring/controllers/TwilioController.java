package tn.esprit.spring.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.SmsRequest;
import tn.esprit.spring.services.TwilioService;

@RestController
@RequestMapping("api/v1/sms")
public class TwilioController {
	private TwilioService  twilioService;
	 @Autowired
	public TwilioController(TwilioService  twilioService) {
		this.twilioService =twilioService;
	}
	@PostMapping
	public void sendSms(@Valid@RequestBody SmsRequest smsRequest) {
		twilioService.sendSms(smsRequest);
	}
	
}

package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.SmsRequest;
import tn.esprit.spring.entities.SmsSender;

@Service
public class TwilioService {
 private final SmsSender smsSender;

public  TwilioService(@Qualifier("twilio") TwilioSmsSender smsSender) {
	this.smsSender = smsSender;
}

public void sendSms(SmsRequest smsRequest) {
	smsSender.sendSms(smsRequest);
}
}

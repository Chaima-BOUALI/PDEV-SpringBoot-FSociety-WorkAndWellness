package tn.esprit.spring.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

import tn.esprit.spring.config.TwilioConfig;
import tn.esprit.spring.entities.SmsRequest;
import tn.esprit.spring.entities.SmsSender;

@Service("twilio")
public class TwilioSmsSender implements SmsSender {
	private static final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);

	private final TwilioConfig twilioConfig;

	@Autowired
	public TwilioSmsSender(TwilioConfig twilioConfig) {
		this.twilioConfig = twilioConfig;
	}

	@Override
	public void sendSms(SmsRequest smsRequest) {
		//if (isPhoneNumberValid(smsRequest.getPhoneNumber()))/{

			PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
			PhoneNumber from = new PhoneNumber(twilioConfig.getTrialNumber());
			String message = smsRequest.getMessage();
			MessageCreator creator = Message.creator(to, from, message);
			creator.create();
			LOGGER.info("send sms {}" + smsRequest);
		//} //else {
			//throw new IllegalArgumentException(
					//"Phone number [" + smsRequest.getPhoneNumber() + "] is not a valid number");
		//}

	}

	private boolean isPhoneNumberValid(String phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}

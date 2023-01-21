package com.springboot.sendemail.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SeviceEmail implements IservicEmail {

	
	private final JavaMailSender javaMailSender;
	
	@Autowired
	public SeviceEmail(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}



	@Override
	public void sendEmail(String to, String subject, String message) {
		// TODO Auto-generated method stub
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("vinyssusrodolphe@gmail.com");
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		
		this.javaMailSender.send(simpleMailMessage);
	}
	

}

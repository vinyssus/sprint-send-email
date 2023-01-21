package com.springboot.sendemail.service;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
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
	public void sendEmail(String to, String subject, String message, String file) {
		// TODO Auto-generated method stub
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom("vinyssusrodolphe@gmail.com");
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		
		FileSystemResource fileSystemRessource = new FileSystemResource(new File(file));
		
		this.javaMailSender.send(simpleMailMessage);
	}
	

}

package com.springboot.sendemail.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sendemail.ressource.EmailMessage;
import com.springboot.sendemail.service.SeviceEmail;

@RestController
public class EmailController {
	
	@Autowired
	 SeviceEmail se;

	@PostMapping("/send-email")
	public ResponseEntity<String> sendEmail(@RequestBody EmailMessage emailMessage) throws MessagingException {
		se.sendEmail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage(), emailMessage.getFile());
		return ResponseEntity.ok("Succes");
	}
}

package com.springboot.sendemail.service;

import javax.mail.MessagingException;

import org.springframework.stereotype.Service;

@Service
public interface IservicEmail {

	void sendEmail(String to, String subject, String message, String file)throws MessagingException;
}

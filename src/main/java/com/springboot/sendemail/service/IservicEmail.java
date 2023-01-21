package com.springboot.sendemail.service;

import org.springframework.stereotype.Service;

@Service
public interface IservicEmail {

	void sendEmail(String to, String subject, String message);
}

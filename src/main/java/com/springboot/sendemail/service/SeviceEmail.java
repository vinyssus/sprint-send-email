package com.springboot.sendemail.service;
import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SeviceEmail implements IservicEmail {

	
	private JavaMailSender javaMailSender;

	

	@Autowired
	public SeviceEmail(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	


	@Override
	public void sendEmail(String to, String subject, String message, String file) throws MessagingException {
		// TODO Auto-generated method stub
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();

	    MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
//		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//		simpleMailMessage.setFrom("vinyssusrodolphe@gmail.com");
//		simpleMailMessage.setTo(to);
//		simpleMailMessage.setSubject(subject);
//		simpleMailMessage.setText(message);

	    mimeMessageHelper.setFrom("vinyssusrodolphe@gmail.com");
	    mimeMessageHelper.setTo(to);
	    mimeMessageHelper.setSubject(subject);
	    mimeMessageHelper.setText(message);
		
		FileSystemResource fileSystemRessource = new FileSystemResource(new File(file));
		mimeMessageHelper.addAttachment(fileSystemRessource.getFilename(), fileSystemRessource);
		
		this.javaMailSender.send(mimeMessage);
	}
	

}

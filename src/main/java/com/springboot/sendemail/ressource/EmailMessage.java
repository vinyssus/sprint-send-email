package com.springboot.sendemail.ressource;


public class EmailMessage {
	
	private String to;
	private String subject;
	private String message;
	private String file;
	public EmailMessage(String to, String subject, String message, String file) {
		super();
		this.to = to;
		this.subject = subject;
		this.message = message;
		this.file = file;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

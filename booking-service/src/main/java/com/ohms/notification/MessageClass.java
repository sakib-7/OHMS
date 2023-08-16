package com.ohms.notification;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageClass implements Serializable {
	
	private String guestEmail;
	private String subject;
	private String body;
	public MessageClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MessageClass(String guestEmail, String subject, String body) {
		super();
		this.guestEmail = guestEmail;
		this.subject = subject;
		this.body = body;
	}
	public String getGuestEmail() {
		return guestEmail;
	}
	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}

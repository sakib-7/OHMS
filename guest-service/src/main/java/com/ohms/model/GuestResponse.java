package com.ohms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This is the response sent when guest is added
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GuestResponse {	
	private String message;
	private int guestId;
	private String guestEmailId;
	public GuestResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GuestResponse(String message, int guestId, String guestEmailId) {
		super();
		this.message = message;
		this.guestId = guestId;
		this.guestEmailId = guestEmailId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public String getGuestEmailId() {
		return guestEmailId;
	}
	public void setGuestEmailId(String guestEmailId) {
		this.guestEmailId = guestEmailId;
	}
}

package com.ohms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Response message class
 *
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomResponse {
	private String message;

	public RoomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

package com.ohms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
	private String message;
	private double price;
	private int bookingId;
	public BookingResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingResponse(String message, double price, int bookingId) {
		super();
		this.message = message;
		this.price = price;
		this.bookingId = bookingId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
}

package com.ohms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	private String paymentMode;
	private boolean paymentStatus;
	private int bookingID;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(String paymentMode, boolean paymentStatus, int bookingID) {
		super();
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.bookingID = bookingID;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
}

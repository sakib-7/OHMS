package com.ohms.model;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity class to store the data and fetch the data from database
 *
 */
@Document("Booking")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
	
	@Id
	private int bookingId;
	private String roomId;
	private int guestId;
	private Date checkInDate;
	private Date checkOutDate;
	private boolean checkInStatus;
	private boolean chekOutStatus;
	private double totalPrice;
	private String paymentMode;
	private boolean paymentStatus;
	private String bookingStatus;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bookingId, String roomId, int guestId, Date checkInDate, Date checkOutDate,
			boolean checkInStatus, boolean chekOutStatus, double totalPrice, String paymentMode, boolean paymentStatus,
			String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.roomId = roomId;
		this.guestId = guestId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.checkInStatus = checkInStatus;
		this.chekOutStatus = chekOutStatus;
		this.totalPrice = totalPrice;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.bookingStatus = bookingStatus;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public boolean isCheckInStatus() {
		return checkInStatus;
	}
	public void setCheckInStatus(boolean checkInStatus) {
		this.checkInStatus = checkInStatus;
	}
	public boolean isChekOutStatus() {
		return chekOutStatus;
	}
	public void setChekOutStatus(boolean chekOutStatus) {
		this.chekOutStatus = chekOutStatus;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
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
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
}

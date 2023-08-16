package com.ohms.model;

import javax.validation.constraints.NotNull;

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

@Document("Room")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
	@Id
	private String roomId;
	@NotNull(message="Room Type cannnot be null")
	private String roomType;
	@NotNull(message="Number of beds cannnot be null")
	private int numberOfBeds;
	private boolean status;
	private double price;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(String roomId, @NotNull(message = "Room Type cannnot be null") String roomType,
			@NotNull(message = "Number of beds cannnot be null") int numberOfBeds, boolean status, double price) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.numberOfBeds = numberOfBeds;
		this.status = status;
		this.price = price;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getNumberOfBeds() {
		return numberOfBeds;
	}
	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

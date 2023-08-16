package com.ohms.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity class to store the data and fetch the data from database
 * BookedRoom is used to store the booked rooms for particular day 
 *
 */
@Document("BookedRooms")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRooms {
	
	@Id
	private String id;
	private Date date;
	private List<String> roomIds;
	public BookedRooms() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookedRooms(String id, Date date, List<String> roomIds) {
		super();
		this.id = id;
		this.date = date;
		this.roomIds = roomIds;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getRoomIds() {
		return roomIds;
	}
	public void setRoomIds(List<String> roomIds) {
		this.roomIds = roomIds;
	}

}

package com.ohms.model;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {
	
	private String id;
	private Date date;
	private String roomId;
	public RoomDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoomDTO(String id, Date date, String roomId) {
		super();
		this.id = id;
		this.date = date;
		this.roomId = roomId;
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
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

}

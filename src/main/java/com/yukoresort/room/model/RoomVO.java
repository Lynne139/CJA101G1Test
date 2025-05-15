package com.yukoresort.room.model;

public class RoomVO {
	private Integer roomId;
	private String roomName;
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public RoomVO() {
		super();
		
	}
	public RoomVO(Integer roomId, String roomName) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
	}
	

}

package com.property.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "property_data", schema="core")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Property {
	
	@Id
	@Column(name="prop_id")
	private String id;
	@Column(name="roomnumber")
	private long roomNumber;
	@Column(name="square")
	private String square;
	@Column(name="description")
	private String description;
	@Column(name="image")
	private String image;
	@Column(name="address")
	private String address;
	
	public Property() {
		
	}

	public Property(long roomNumber, String square, String description, String image, String address) {
		this.roomNumber = roomNumber;
		this.square = square;
		this.description = description;
		this.image = image;
		this.address = address;
	}
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public long getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(long roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getSquare() {
		return square;
	}

	public void setSquare(String square) {
		this.square = square;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

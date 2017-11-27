package de.dhbw.ravensburg.webprogramming.bookingservice.api.model;

import java.util.Date;

public class BookingRequest {
	
	private String bookingId;
	private String flightId;
	private String userId;
	private String seatNr;
	private String price;
	private Boolean confirmed;
	private Date created;
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSeatNr() {
		return seatNr;
	}
	public void setSeatNr(String seatNr) {
		this.seatNr = seatNr;
	}
	public Boolean getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}

package de.dhbw.ravensburg.webprogramming.bookingservice.api.model;

public class BookingResponse {
	private Boolean confirmed;
	private Integer bookingId;
	public Boolean getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	
}

package de.dhbw.ravensburg.webprogramming.bookingservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import de.dhbw.ravensburg.webprogramming.bookingservice.repository.BookingRepository;

/**
 * Entity for a Booking Resource.
 * The @Entity Annotation makes this class an entity so it can be persisted.
 * When saving this Entity for the first time with the {@link BookingRepository} 
 * a table with all required columns will be created automatically.
 */
@Entity
public class BookingEntity {
	
	/**
	 * The primary key of a Booking.
	 */
	@Id
	@GeneratedValue
	private Integer bookingId;
	private String flightId;
	private String userId;
	private String seatNr;
	private Boolean confirmed;
	private Date created;
	
	
	public BookingEntity() {
		super();
	}
	
	


	public BookingEntity( String flightId, String userId, String seatNr, Boolean confirmed,
			Date created) {
		super();
		this.flightId = flightId;
		this.userId = userId;
		this.seatNr = seatNr;
		this.confirmed = confirmed;
		this.created = created;
	}




	public Integer getBookingId() {
		return bookingId;
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

	
	
	
	
	

}

package de.dhbw.ravensburg.webprogramming.bookingservice.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FlightSearchEntity {
	
	@Id
	private String flightId;
	private String destination;
	private String origin;
	private Date arrivalDate;
	private Date departureDate;
	
	
	
	public FlightSearchEntity(String flightId, String destination, String origin, Date arrivalDate,
			Date departureDate) {
		super();
		this.flightId = flightId;
		this.destination = destination;
		this.origin = origin;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	
}

package de.dhbw.ravensburg.webprogramming.bookingservice.api.model;

import java.math.BigDecimal;
import java.util.Date;

public class FlightSearchResult {
	
	private String flightId;
	private String destination;
	private String origin;
	private Date startDate;
	private Date arrivalDate;
	private BigDecimal price;
	
	
	
	public FlightSearchResult(String flightId, String destination, String origin, Date startDate, Date arrivalDate,
			BigDecimal price) {
		super();
		this.flightId = flightId;
		this.destination = destination;
		this.origin = origin;
		this.startDate = startDate;
		this.arrivalDate = arrivalDate;
		this.price = price;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

}

package de.dhbw.ravensburg.webprogramming.flightservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import de.dhbw.ravensburg.webprogramming.flightservice.repository.FlightRepository;

/**
 * Entity for a Flight Resource.
 * The @Entity Annotation makes this class an entity so it can be persisted.
 * When saving this Entity for the first time with the {@link FlightRepository} 
 * a table with all required columns will be created automatically.
 */
@Entity
public class FlightEntity {
	
	/**
	 * The primary key of a flight.
	 */
	@Id
	private String flightId;
	private String destination;
	private String origin;
	private Date startDate;
	private Date endDate;
	private String destinationGate;
	private String originGate;
	
	
	
	public FlightEntity() {
		super();
	}
	public FlightEntity(String flightId, String destination, String origin, Date startDate, Date endDate,
			String destinationGate, String originGate) {
		super();
		this.flightId = flightId;
		this.destination = destination;
		this.origin = origin;
		this.startDate = startDate;
		this.endDate = endDate;
		this.destinationGate = destinationGate;
		this.originGate = originGate;
	}
	
	// Getters and Setters
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
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDestinationGate() {
		return destinationGate;
	}
	public void setDestinationGate(String destinationGate) {
		this.destinationGate = destinationGate;
	}
	public String getOriginGate() {
		return originGate;
	}
	public void setOriginGate(String originGate) {
		this.originGate = originGate;
	}
	
	
	
	
	

}

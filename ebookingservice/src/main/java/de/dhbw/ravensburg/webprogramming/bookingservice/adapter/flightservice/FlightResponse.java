package de.dhbw.ravensburg.webprogramming.bookingservice.adapter.flightservice;


import java.util.Date;
import java.util.List;


public class FlightResponse {
	
	private List<Flight> flights;
	
	
	
	public List<Flight> getFlights() {
		return flights;
	}



	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}



	public class Flight {
		
		/**
		 * The primary key of a flight.
		 */
		private String flightId;
		private String destination;
		private String origin;
		private Date startDate;
		private Date endDate;
		private String destinationGate;
		private String originGate;
		
		
		
		public Flight() {
			super();
		}
		public Flight(String flightId, String destination, String origin, Date startDate, Date endDate,
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
		
		public Flight(String flightId, String destination, String origin, Date startDate, Date endDate) {
			super();
			this.flightId = flightId;
			this.destination = destination;
			this.origin = origin;
			this.startDate = startDate;
			this.endDate = endDate;
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
	
	
	
	
	
	

}

package de.dhbw.ravensburg.webprogramming.flightservice.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * Rest Controller for Resource: <br>
 * Flight
 *
 */

import de.dhbw.ravensburg.webprogramming.flightservice.model.FlightEntity;
import de.dhbw.ravensburg.webprogramming.flightservice.repository.FlightRepository;
/**
 * This class acts as a controller for 
 * HTTP Rest Requests to manage the resource of a "Flight".
 *
 */
@RestController
public class RestFlightController {
	
	
	/**
	 * Automatically injects the FlightRepository that grants 
	 * access to the database and offers methods for basic CRUD operations.
	 */
	@Autowired
	FlightRepository flightRepo;
	

	/**
	 * Save / Update a given flight identified by the parameter flightId.<br/>
	 * This method can be accessed via. HTTP using the POST method and the URL 
	 * specified in the @RequestMapping's path parameter. 
	 * The following parameters can be submitted with the HTTP Request:
	 * @param flightId Unique identifier of a flight.
	 * @param destination The destination where the flight is headed to.
	 * @param origin The origin where the flight leaves.
	 * @param destinationGate The gate identifier at the destination airport.
	 * @param originGate The gate identifier at the origin airport.
	 * @param startDate The date and time of the departure.
	 * @param endDate The date and time of the arrival.
	 * @return "OK" if save was successful.
	 */
	@RequestMapping(path = "api/flight", method = RequestMethod.POST)
	public String postFlight(@RequestParam (value="flightId") String flightId, 
			@RequestParam(value="destination") String destination, 
			@RequestParam(value="origin") String origin, 
			@RequestParam(value="destinationGate", required=false) String destinationGate,
			@RequestParam(value="originGate", required=false) String originGate,
			@RequestParam(value="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm") Date startDate,
			@RequestParam(value="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm") Date endDate){
		// Just print the flightId to see something in the log.
		System.out.println(flightId);
		// Create a new Entity and map all request parameters to their destination:
		FlightEntity flightEntity = new FlightEntity();
		flightEntity.setFlightId(flightId);
		flightEntity.setDestination(destination);
		flightEntity.setOrigin(origin);
		flightEntity.setDestinationGate(destinationGate);
		flightEntity.setOriginGate(originGate);
		flightEntity.setStartDate(startDate);
		flightEntity.setEndDate(endDate);
		// Save the entity to the database, 
		// this will overwrite an existing entity with the same flightId.
		flightRepo.save(flightEntity);
		return "OK";
	}
	
	
	
	/**
	 * Find all existing flights and return them as List of JSON objects.
	 * This method cann be accessed via HTTP method GET and the specified URL.
	 * @return All existing flights from the FlightsRepository as JSON representation.
	 */
	@RequestMapping(path = "api/flight", method = RequestMethod.GET)
	public List<FlightEntity> getAllFlights() {
		return flightRepo.findAll();
	}
	
	
	
	
	
	

}

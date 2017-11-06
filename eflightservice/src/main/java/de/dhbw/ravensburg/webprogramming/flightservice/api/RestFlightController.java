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
@RestController
public class RestFlightController {
	
	
	@Autowired
	FlightRepository flightRepo;
	
	/**
	 * Save / update a given flight.
	 * @param flug The flight to save / Update
	 */
	@RequestMapping(path = "api/flight", method = RequestMethod.POST)
	public String postFlight(@RequestParam (value="flightId") String flightId, 
			@RequestParam(value="destination") String destination, 
			@RequestParam(value="origin") String origin, 
			@RequestParam(value="destinationGate") String destinationGate,
			@RequestParam(value="originGate") String originGate,
			@RequestParam(value="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm") Date startDate,
			@RequestParam(value="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm") Date endDate){
		System.out.println(flightId);
		FlightEntity flightEntity = new FlightEntity();
		flightEntity.setFlightId(flightId);
		flightEntity.setDestination(destination);
		flightEntity.setOrigin(origin);
		flightEntity.setDestinationGate(destinationGate);
		flightEntity.setOriginGate(originGate);
		flightEntity.setStartDate(startDate);
		flightEntity.setEndDate(endDate);
		flightRepo.save(flightEntity);
		return "OK";
	}
	
	
	
	@RequestMapping(path = "api/flight", method = RequestMethod.GET)
	public List<FlightEntity> getAllFlights() {
		return flightRepo.findAll();
	}
	
	
	

}

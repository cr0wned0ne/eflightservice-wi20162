package de.dhbw.ravensburg.webprogramming.flightservice.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Rest Controller for Resource: <br>
 * Flight
 *
 */
@RestController
public class RestFlightController {
	
	/**
	 * Save / update a given flight.
	 * @param flug The flight to save / Update
	 */
	@RequestMapping(path = "api/flight", method = RequestMethod.PUT)
	public void putFlight(@RequestBody String flight){
		System.out.println(flight);
		// TODO: Implement saving / updating logic.
	}
	
	
	

}

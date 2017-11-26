package de.dhbw.ravensburg.webprogramming.bookingservice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

import de.dhbw.ravensburg.webprogramming.bookingservice.api.model.BookingRequest;
import de.dhbw.ravensburg.webprogramming.bookingservice.api.model.BookingResponse;
import de.dhbw.ravensburg.webprogramming.bookingservice.model.BookingEntity;
import de.dhbw.ravensburg.webprogramming.bookingservice.repository.BookingRepository;
/**
 * This class acts as a controller for 
 * HTTP Rest Requests to manage the resource of a "Booking".
 *
 */
@RestController
public class RestBookingController {
	
	
	/**
	 * Automatically injects the FlightRepository that grants 
	 * access to the database and offers methods for basic CRUD operations.
	 */
	@Autowired
	BookingRepository bookingRepo;
	


	/**
	 * Take in a booking request.
	 * @param request {@link BookingRequest}.
	 * @return return {@link BookingResponse}.
	 */
	@RequestMapping(path = "api/booking", method = RequestMethod.POST)
	public BookingResponse postBookingRequest(@RequestBody BookingRequest request){
		// Just print the request to see something in the log.
		System.out.println(request);
		// Create a new Entity and map all request parameters to their destination:
		BookingEntity bookingEntity = new BookingEntity();
		bookingEntity.setFlightId(request.getFlightId());
		bookingEntity.setUserId(request.getUserId());
		bookingEntity.setSeatNr(request.getSeatNr());
		bookingEntity.setConfirmed(request.getConfirmed());
		bookingEntity.setCreated(request.getCreated());
		// Save the entity to the database, 
		// this will overwrite an existing entity with the same.
		bookingRepo.save(bookingEntity);
		BookingResponse response = new BookingResponse();
		response.setBookingId(bookingEntity.getBookingId());
		response.setConfirmed(bookingEntity.getConfirmed());
		return response;
	}
	
	
	
	/**
	 * Find all existing flights and return them as List of JSON objects.
	 * This method cann be accessed via HTTP method GET and the specified URL.
	 * @return All existing flights from the FlightsRepository as JSON representation.
	 */
	@RequestMapping(path = "api/booking", method = RequestMethod.GET)
	public List<BookingEntity> getAllBookings() {
		return bookingRepo.findAll();
	}
	
	/**
	 * Find all existing flights and return them as List of JSON objects.
	 * This method cann be accessed via HTTP method GET and the specified URL.
	 * @return All existing flights from the FlightsRepository as JSON representation.
	 */
	@RequestMapping(path = "api/booking", method = RequestMethod.DELETE)
	public BookingResponse deleteBooking(@RequestParam Integer id) {
		bookingRepo.delete(id);
		BookingResponse response = new BookingResponse();
		response.setBookingId(id);
		response.setConfirmed(true);
		return response;
	}
	
	
	@RequestMapping(path = "api/booking/{userId}", method = RequestMethod.GET)
	public List<BookingEntity> getByUserId(@PathVariable(value="userId") String userId) {
		return bookingRepo.findByUserId(userId);
		
	}
	
	
	
	
	

}

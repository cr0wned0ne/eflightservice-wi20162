package de.dhbw.ravensburg.webprogramming.bookingservice.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.dhbw.ravensburg.webprogramming.bookingservice.api.model.FlightSearchRequest;
import de.dhbw.ravensburg.webprogramming.bookingservice.api.model.FlightSearchResult;
import de.dhbw.ravensburg.webprogramming.bookingservice.model.FlightSearchEntity;
import de.dhbw.ravensburg.webprogramming.bookingservice.repository.FlightSearchRepository;

@RestController
public class RestFlightSearchController {
	@Autowired
	private FlightSearchRepository repo;
	
	@RequestMapping(path="api/search", method = RequestMethod.POST )
	public List<FlightSearchResult> searchFlights(@RequestBody FlightSearchRequest request) {
		List<FlightSearchResult> flights = new ArrayList<FlightSearchResult>();
		flights.add(new FlightSearchResult("L123", "FDH", "STR", new Date(), new Date(System.currentTimeMillis() + 1000000), new BigDecimal("99.00")));
		flights.add(new FlightSearchResult("L143", "STR", "FDH", new Date(), new Date(System.currentTimeMillis() + 1000000), new BigDecimal("89.00")));
		return flights;
	}
	
	@RequestMapping(path="api/search/all", method = RequestMethod.GET )
	public List<FlightSearchResult> getAllFlights() {
		Iterable<FlightSearchEntity> result = repo.findAll();
		List<FlightSearchResult> flights = new ArrayList<FlightSearchResult>();
		for (FlightSearchEntity ent : result) {
			
			FlightSearchResult flight = new FlightSearchResult(ent.getFlightId(), ent.getDestination(), ent.getOrigin(), ent.getDepartureDate(), ent.getArrivalDate(), new BigDecimal("99.00"));
			flights.add(flight);
		}
		return flights;
	}

}

package de.dhbw.ravensburg.webprogramming.bookingservice.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.dhbw.ravensburg.webprogramming.bookingservice.api.model.FlightSearchRequest;
import de.dhbw.ravensburg.webprogramming.bookingservice.api.model.FlightSearchResult;

@RestController
public class RestFlightSearchController {
	
	@RequestMapping(path="api/search", method = RequestMethod.POST )
	public List<FlightSearchResult> searchFlights(@RequestBody FlightSearchRequest request) {
		List<FlightSearchResult> flights = new ArrayList<FlightSearchResult>();
		flights.add(new FlightSearchResult("L123", "FDH", "STR", new Date(), new Date(System.currentTimeMillis() + 1000000), new BigDecimal("99.00")));
		flights.add(new FlightSearchResult("L143", "STR", "FDH", new Date(), new Date(System.currentTimeMillis() + 1000000), new BigDecimal("89.00")));
		return flights;
		
	}

}

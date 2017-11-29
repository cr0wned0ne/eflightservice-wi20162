package de.dhbw.ravensburg.webprogramming.bookingservice.adapter.flightservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.dhbw.ravensburg.webprogramming.bookingservice.adapter.flightservice.FlightResponse.Flight;
import de.dhbw.ravensburg.webprogramming.bookingservice.model.FlightSearchEntity;
import de.dhbw.ravensburg.webprogramming.bookingservice.repository.FlightSearchRepository;


@Service
public class FlightServiceAdapter {

	private final RestTemplate template;
	@Autowired
	private FlightSearchRepository repo;
	
	public FlightServiceAdapter(RestTemplateBuilder restTemplateBuilder) {
        this.template = restTemplateBuilder.build();
    }
	
	public void loadAllFlightData() {
		Object[] result = this.template.getForObject("http://localhost:8080/api/flight", Object[].class);
		List<FlightSearchEntity> flights = new ArrayList<FlightSearchEntity>();
		for (int i = 0; i < result.length; i++) {
			Object obj = result[i];
			if (obj instanceof Flight) {
				Flight flight = (Flight) obj;
				FlightSearchEntity entity = new FlightSearchEntity(flight.getFlightId(), flight.getDestination(), flight.getOrigin(), flight.getEndDate(), flight.getStartDate());
				flights.add(entity);
			}
		}
		repo.save(flights);
	
	}
}

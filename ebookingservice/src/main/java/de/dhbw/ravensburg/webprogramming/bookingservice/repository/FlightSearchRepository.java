package de.dhbw.ravensburg.webprogramming.bookingservice.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.dhbw.ravensburg.webprogramming.bookingservice.model.FlightSearchEntity;

public interface FlightSearchRepository extends CrudRepository<FlightSearchEntity, String>{

	
	public List<String> findByDepartureDateBetween(Date from, Date to);
}

package de.dhbw.ravensburg.webprogramming.flightservice.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import de.dhbw.ravensburg.webprogramming.flightservice.model.FlightEntity;

/**
 * Repository Service for CRUD operations on {@link FlightEntity}.
 *
 */
public interface FlightRepository extends Repository<FlightEntity, String>{

	/**
	 * Saves a given {@link FlightEntity}.
	 * @param flight {@link FlightEntity}.
	 */
	public void save(FlightEntity flight);
	
	
	/**
	 * Find all available {@link FlightEntity}s.
	 * @return List of {@link FlightEntity}s.
	 */
	public List<FlightEntity> findAll();
	
	
}

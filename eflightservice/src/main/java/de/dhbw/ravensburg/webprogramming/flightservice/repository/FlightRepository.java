package de.dhbw.ravensburg.webprogramming.flightservice.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import de.dhbw.ravensburg.webprogramming.flightservice.model.FlightEntity;

public interface FlightRepository extends Repository<FlightEntity, String>{

	public void save(FlightEntity flight);
	
	
	public List<FlightEntity> findAll();
	
	
}

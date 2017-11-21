package de.dhbw.ravensburg.webprogramming.flightservice.repository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import de.dhbw.ravensburg.webprogramming.flightservice.model.FlightEntity;
/**
 * This class initializes the database with some data.
 * It is executed automatically when the application starts.
 */
@Component
public class RepositoryInitializer implements ApplicationListener<ApplicationReadyEvent>{

	@Autowired
	FlightRepository repo;
	
	public void onApplicationEvent(ApplicationReadyEvent arg0) {
		System.out.println("initialize dummy database entries...");
		repo.save(new FlightEntity("F654", "STR", "FDH", new Date(), new Date(System.currentTimeMillis() + 1000000), null, null));
		repo.save(new FlightEntity("S876", "FDH", "STR", new Date(System.currentTimeMillis() + 10000000), new Date(System.currentTimeMillis() + 11000000), null, null));
		
		repo.save(new FlightEntity("O987", "STR", "FDH", new Date(System.currentTimeMillis() + 990000000), new Date(System.currentTimeMillis() + 991000000), null, null));
		repo.save(new FlightEntity("L5U3", "FDH", "STR", new Date(System.currentTimeMillis() + 998000000), new Date(System.currentTimeMillis() + 999000000), null, null));
	
	}

}

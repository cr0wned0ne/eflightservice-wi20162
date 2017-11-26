package de.dhbw.ravensburg.webprogramming.bookingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Application main class for eFlightService.
 * This class starts up the Spring Boot Application and the embedded Tomcat Webserver.
 *
 */
@SpringBootApplication
public class BookingServiceApp 
{
	/**
	 * Start the Spring Boot Application with the given args.
	 * @param args The given Arguments.
	 */
    public static void main( String[] args )
    {
    	SpringApplication.run(BookingServiceApp.class, args);
    	System.out.println("Booking Service up and running...");
    }
}

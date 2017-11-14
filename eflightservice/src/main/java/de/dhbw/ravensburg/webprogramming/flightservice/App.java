package de.dhbw.ravensburg.webprogramming.flightservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Application main class for eFlightService.
 * This class starts up the Spring Boot Application and the embedded Tomcat Webserver.
 *
 */
@SpringBootApplication
public class App 
{
	/**
	 * Start the Spring Boot Application with the given args.
	 * @param args The given Arguments.
	 */
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    	System.out.println("Hello World!");
    }
}

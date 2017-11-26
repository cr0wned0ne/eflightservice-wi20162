package de.dhbw.ravensburg.webprogramming.bookingservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.dhbw.ravensburg.webprogramming.bookingservice.model.BookingEntity;

/**
 * Repository Service for CRUD operations on {@link BookingEntity}.
 * It extends a Spring Data Repository Interface that provides basic methods for
 * accessing data out of the box.
 * The default location to check for the database is localhost.
 *
 */
public interface BookingRepository extends CrudRepository<BookingEntity, Integer>{

	
	
	/**
	 * Find all available {@link BookingEntity}s.
	 * @return List of {@link BookingEntity}s.
	 */
	public List<BookingEntity> findAll();
	
	/**
	 * Find all for a given user.
	 * @param userId the user id to search for.
	 * @return
	 */
	public List<BookingEntity> findByUserId(String userId);
	
	/**
	 * Find one booking for the given id.
	 * @param bookingId
	 * @return
	 */
	public BookingEntity findByBookingId(Integer bookingId);
	
	
	
}

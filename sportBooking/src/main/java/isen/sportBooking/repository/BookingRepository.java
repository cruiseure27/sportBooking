package isen.sportBooking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import isen.sportBooking.model.Booking;
import isen.sportBooking.model.Member;
import isen.sportBooking.model.Ressource;

public interface BookingRepository extends CrudRepository<Booking, Integer>{

	List<Booking> findByMember(Member member);
	
	List<Booking> findByBeginDate(Date beginDate);
	
	List<Booking> findByRessource(Ressource ressource);
}

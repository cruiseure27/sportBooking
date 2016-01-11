package isen.sportBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import isen.sportBooking.model.Booking;
import isen.sportBooking.repository.BookingRepository;

@Controller
public class BookingControllerImpl implements BookingController{
	
	@Autowired
	BookingRepository bookingRepository;

	public ModelAndView crudChange(Booking booking, BindingResult bindingResult) {
		// TODO Auto-generated method stub
		return null;
	}

	public ModelAndView getBookingList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Booking getBooking(Integer id) {
		return (Booking) bookingRepository.findOne(id);
	}

}

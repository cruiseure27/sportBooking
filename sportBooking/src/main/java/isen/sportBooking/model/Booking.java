package isen.sportBooking.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

public class Booking {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Getter
	@Setter
	private Member member;
	
	@Getter
	@Setter
	private Ressource ressource;
	
	@Getter
	@Setter
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date beginDate;
	
	@Getter
	@Setter
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date endDate;
	
}

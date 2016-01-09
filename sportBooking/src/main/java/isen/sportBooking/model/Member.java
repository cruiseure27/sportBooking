package isen.sportBooking.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

public class Member {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Getter
	@Setter
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthDate;
	
	@Getter
	@Setter
	private String lastName;
	
	@Getter
	@Setter
	private String firstName;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

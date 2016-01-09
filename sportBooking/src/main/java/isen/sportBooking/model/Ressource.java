package isen.sportBooking.model;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

public class Ressource {
	
	@Id
	private Integer id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String description;
	
	public Ressource() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package isen.sportBooking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Place {


	@Id
	@GeneratedValue
	private Integer id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private List<Ressource> ressourceList;
	
	
	
	public Place() {
		// TODO Auto-generated constructor stub
	}
	

	
}

package isen.sportBooking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Club {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Getter
	@Setter
	private List<Place> placeList;
	
	@Getter
	@Setter
	private List<Member> memberList;

	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

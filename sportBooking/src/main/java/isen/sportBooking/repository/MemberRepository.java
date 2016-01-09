package isen.sportBooking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import isen.sportBooking.model.Member;

public interface MemberRepository extends CrudRepository<Member, Integer>{

	List<Member> findByLastName(String lastName);
	
}

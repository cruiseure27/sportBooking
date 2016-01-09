package isen.sportBooking.repository;

import org.springframework.data.repository.CrudRepository;

import isen.sportBooking.model.Place;

public interface PlaceRepository extends CrudRepository<Place, Integer> {
}
package isen.sportBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import isen.sportBooking.model.Place;

public interface PlaceRepository extends JpaRepository<Place, String> {
}
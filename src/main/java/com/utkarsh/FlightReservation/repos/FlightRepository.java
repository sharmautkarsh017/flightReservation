package com.utkarsh.FlightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.FlightReservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}

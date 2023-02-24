package com.utkarsh.FlightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.FlightReservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}

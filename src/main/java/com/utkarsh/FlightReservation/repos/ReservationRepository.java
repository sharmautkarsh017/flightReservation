package com.utkarsh.FlightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.FlightReservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}

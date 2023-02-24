package com.utkarsh.FlightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.FlightReservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

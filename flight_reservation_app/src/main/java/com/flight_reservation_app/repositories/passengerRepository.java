package com.flight_reservation_app.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.flight_reservation_app.entities.passenger;

public interface passengerRepository extends JpaRepositoryImplementation<passenger, Long> {

}

package com.flight_reservation_app.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.flight_reservation_app.entities.flight;

public interface flightRepository extends JpaRepositoryImplementation<flight, Long> {

}

package com.flight_reservation_app.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstructEntity {
	private Boolean checkedIn;
	private int numberOfBags;
	@OneToOne
	private passenger passenger;
	@OneToOne
	private flight flight;
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) { 
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(passenger passenger) {
		this.passenger = passenger;
	}
	public flight getFlight() {
		return flight;
	}
	public void setFlight(flight flight) {
		this.flight = flight;
	}
	

}

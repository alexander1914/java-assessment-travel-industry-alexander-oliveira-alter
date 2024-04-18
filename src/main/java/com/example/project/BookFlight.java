package com.example.project;

import com.example.project.model.Flight;

import static com.example.project.enums.StatusFligth.Cancel;
import static com.example.project.enums.StatusFligth.Successfull;

/**
 * Problem 1
 * Design a flight booking system where users can book flights based on availability.
 * Implement methods for booking a flight, checking seat availability, and to cancel a booking.
 * Additionally, introduce seat allocation logic to optimize seat usage,
 * considering factors like seat preferences and booking for more than one passenger.
 *
 * TIP: every flight must be represented by a flight number which is usually a string eg. EK1723
 */

public class BookFlight {

	public BookFlight() {
	}

	public boolean book(Flight flight) {
		// write you code here
		if (!flight.getTicket().isEmpty() || !flight.getTicket().isBlank()) {
			flight.setStatus(Successfull);
			System.out.println("The ticket number: " + flight.getTicket());
			System.out.println("This fligth following with status: " + flight.getStatus());
			return true; // if successful
		}else{
			System.out.println("This fligth following with status: " + flight.getStatus());
			return false;
		}
	}

	public int seatAvailability(Flight flight) {
		// write you code here
		if (flight.getSeat().size() >= 0){
			flight.getSeat().get(0);
			System.out.println("The seats total is: " + flight.getSeat().size());
			return 1;
		}else{
			System.out.println("The seats total is: " + flight.getSeat().size());
			return 0; // number of available seats
		}
	}

	public boolean cancel(Flight flight) {
		// write your code here
		if(!flight.getTicket().isBlank() || !flight.getTicket().isEmpty()){
			flight.setStatus(Cancel);
			System.out.println("The ticket number: " + flight.getTicket());
			System.out.println("This fligth following with status: " + flight.getStatus());
			return true; // if successfully cancelled
		}else{
			System.out.println("This fligth following with status: " + flight.getStatus());
			return false;
		}
	}
}



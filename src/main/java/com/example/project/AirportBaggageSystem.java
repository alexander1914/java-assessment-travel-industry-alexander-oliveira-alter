package com.example.project;

import com.example.project.enums.StatusBaggage;
import com.example.project.model.Baggage;
import com.example.project.model.Flight;

/**
 * Problem 3
 * Design an airport baggage handling system that tracks baggage from check-in to final destination,
 * considering transfer flights and baggage transfer processes between flights.
 * Implement methods to add baggage to a flight, track the location of baggage,
 * and handle baggage transfers between connecting flights.
 * <p>
 * TIP: every flight must be represented by a flight number which is usually a string eg. EK1723
 */

public class AirportBaggageSystem {
    // write your code here
    public Flight add(String ticket, StatusBaggage statusBaggage, Baggage baggage, String destination) {

        switch (statusBaggage) {
            case YES:
                if (baggage.isConection()) {
                    baggage.setLocation(destination);
                    baggage.setFligthConnection(ticket);
                    System.out.println("This ticket has a connection folliwing informations: ");
                    System.lineSeparator();
                    System.out.println("The ticket here: " + baggage.getTicket());
                    System.lineSeparator();
                    System.out.println("The numbers of baggages here: " + baggage.getNumberOfBaggages());
                    System.lineSeparator();
                    System.out.println("Following next destination now: " + baggage.getLocation());
                    break;
                } else {
                    baggage.setLocation(destination);
                    System.out.println("This ticket hasn't a connection folliwing informations: ");
                    System.lineSeparator();
                    System.out.println("The ticket here: " + baggage.getTicket());
                    System.lineSeparator();
                    System.out.println("The numbers of baggages here: " + baggage.getNumberOfBaggages());
                    System.lineSeparator();
                    System.out.println("Following next destination now: " + baggage.getLocation());
                    break;
                }

            case NO:
                if (baggage.isConection()) {
                    baggage.setLocation(destination);
                    baggage.setFligthConnection(ticket);
                    System.out.println("This ticket has a connection folliwing informations: ");
                    System.lineSeparator();
                    System.out.println("The ticket here: " + baggage.getTicket());
                    System.lineSeparator();
                    System.out.println("Following next destination now: " + baggage.getLocation());
                } else {
                    baggage.setLocation(destination);
                    System.out.println("This ticket hasn't a connection folliwing informations: ");
                    System.lineSeparator();
                    System.out.println("The ticket here: " + baggage.getTicket());
                    System.lineSeparator();
                    System.out.println("Following next destination now: " + baggage.getLocation());
                    break;
                }
            default:
                break;
        }
        return baggage;
    }
}

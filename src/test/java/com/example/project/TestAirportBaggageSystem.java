package com.example.project;

import com.example.project.enums.StatusBaggage;
import com.example.project.model.Baggage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAirportBaggageSystem {

    @Test
    public void testAirportBaggageSystemYes() {
        // write unit test here
        var baggage = populate();
        AirportBaggageSystem airportBaggageSystem = new AirportBaggageSystem();
        airportBaggageSystem.add(baggage.getTicket(), StatusBaggage.YES, baggage, "Brazil - Sao Paulo");

        Assertions.assertEquals("EK1723", baggage.getTicket());
    }

    @Test
    public void testAirportBaggageSystemNo() {
        // write unit test here
        var baggage = populate();
        AirportBaggageSystem airportBaggageSystem = new AirportBaggageSystem();
        airportBaggageSystem.add(baggage.getTicket(), StatusBaggage.NO, baggage, "Spain - Madrid");

        Assertions.assertEquals("EK1723", baggage.getTicket());
    }

    public Baggage populate(){
        Baggage baggage = new Baggage();
        baggage.setTicket("EK1723");
        baggage.setConection(true);
        baggage.setFligthConnection("Yes");
        baggage.setNumberOfBaggages(2);

        return baggage;
    }

}

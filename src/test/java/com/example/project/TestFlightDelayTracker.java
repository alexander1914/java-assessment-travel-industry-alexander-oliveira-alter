package com.example.project;

import com.example.project.enums.StatusDelay;
import com.example.project.enums.StatusFligth;
import com.example.project.model.Delay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestFlightDelayTracker {

    @Test
    public void testFlightDelayTechnicalIssue() {
        // write unit test here
        var delay = populate();
        FlightDelayTracker flightDelayTracker = new FlightDelayTracker();
        flightDelayTracker.add(StatusDelay.TECHNICAL_ISSUE, delay);

        Assertions.assertEquals(StatusDelay.TECHNICAL_ISSUE, delay.getStatusDelay());
    }

    @Test
    public void testFlightDelayAirTrafficCongestion() {
        // write unit test here
        var delay = populate();
        FlightDelayTracker flightDelayTracker = new FlightDelayTracker();
        flightDelayTracker.add(StatusDelay.AIR_TRAFFIC_CONGESTION, delay);

        Assertions.assertEquals(StatusDelay.AIR_TRAFFIC_CONGESTION, delay.getStatusDelay());
    }

    @Test
    public void testFlightDelayWeater() {
        // write unit test here
        var delay = populate();
        FlightDelayTracker flightDelayTracker = new FlightDelayTracker();
        flightDelayTracker.add(StatusDelay.WEATHER, delay);

        Assertions.assertEquals(StatusDelay.WEATHER, delay.getStatusDelay());
    }

    @Test
    public void testFlightDelayOthers() {
        // write unit test here
        var delay = populate();
        FlightDelayTracker flightDelayTracker = new FlightDelayTracker();
        flightDelayTracker.add(StatusDelay.OTHERS, delay);

        Assertions.assertEquals(StatusDelay.OTHERS, delay.getStatusDelay());
    }
    public Delay populate(){
        List<Integer> sealts = new ArrayList<Integer>();
        sealts.add(1);
        sealts.add(2);

        Delay delay = new Delay();

        delay.setTicket("EK1723");
        delay.setName("Alexander Oliveira");
        delay.setDestination("Brazil");
        delay.setDate(LocalDate.now());
        delay.setSeat(sealts);
        delay.setStatus(StatusFligth.Successfull);
        delay.setHour(10);
        delay.setMinutes(00);

        return delay;
    }
}

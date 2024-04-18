package com.example.project;

import com.example.project.model.Flight;
import com.example.project.enums.StatusFligth;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestBookFlight {
    @Test
    public void testBookFlight() {
        // write unit test here
        BookFlight bookFlight = new BookFlight();
        var fligth = populate();
        bookFlight.book(fligth);

        Assertions.assertEquals(StatusFligth.Successfull, fligth.getStatus());
    }
    @Test
    public void testSeatAvailability(){
        BookFlight bookFlight = new BookFlight();
        var fligth = populate();

        bookFlight.seatAvailability(fligth);

        Assertions.assertEquals(2, fligth.getSeat().size());
    }
    @Test
    public void testCancel(){
        BookFlight bookFlight = new BookFlight();
        var fligth = populate();

        bookFlight.cancel(fligth);

        Assertions.assertEquals(StatusFligth.Cancel, fligth.getStatus());
    }
    public Flight populate(){
        List<Integer> sealts = new ArrayList<Integer>();
        sealts.add(1);
        sealts.add(2);

        Flight flight = new Flight();
        flight.setTicket("EK1723");
        flight.setName("Alexander Oliveira");
        flight.setDestination("Brazil");
        flight.setDate(LocalDate.now());
        flight.setSeat(sealts);
        flight.setStatus(StatusFligth.Successfull);

        return flight;
    }

}

package com.example.project.model;

import com.example.project.enums.StatusFligth;

import java.time.LocalDate;
import java.util.List;

public class Flight {
    private String ticket;
    private String name;
    private String destination;
    private LocalDate date;
    private List<Integer> seat;
    private StatusFligth status;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Integer> getSeat() {
        return seat;
    }

    public void setSeat(List<Integer> seat) {
        this.seat = seat;
    }

    public StatusFligth getStatus() {
        return status;
    }

    public void setStatus(StatusFligth status) {
        this.status = status;
    }
}

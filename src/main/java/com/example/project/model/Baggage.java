package com.example.project.model;

import com.example.project.enums.StatusBaggage;

public class Baggage extends Flight {
    private StatusBaggage baggages;
    private boolean conection;
    private String location;
    private String fligthConnection;
    private Integer numberOfBaggages;

    public StatusBaggage getBaggages() {
        return baggages;
    }

    public void setBaggages(StatusBaggage baggages) {
        this.baggages = baggages;
    }

    public boolean isConection() {
        return conection;
    }

    public void setConection(boolean conection) {
        this.conection = conection;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFligthConnection() {
        return fligthConnection;
    }

    public void setFligthConnection(String fligthConnection) {
        this.fligthConnection = fligthConnection;
    }

    public Integer getNumberOfBaggages() {
        return numberOfBaggages;
    }

    public void setNumberOfBaggages(Integer numberOfBaggages) {
        this.numberOfBaggages = numberOfBaggages;
    }
}

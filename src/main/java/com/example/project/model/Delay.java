package com.example.project.model;

import com.example.project.enums.StatusDelay;

import java.time.LocalTime;

public class Delay extends Flight {
    private StatusDelay statusDelay;
    private  int hour;
    private int minutes;
    private LocalTime timeNow;
    private LocalTime timeDelay;

    public StatusDelay getStatusDelay() {
        return statusDelay;
    }

    public void setStatusDelay(StatusDelay statusDelay) {
        this.statusDelay = statusDelay;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public LocalTime getTimeNow() {
        return timeNow;
    }

    public LocalTime setTimeNow(LocalTime timeNow) {
        this.timeNow = timeNow;
        return timeNow;
    }

    public LocalTime getTimeDelay() {
        return timeDelay;
    }

    public void setTimeDelay(LocalTime timeDelay) {
        this.timeDelay = timeDelay;
    }
}

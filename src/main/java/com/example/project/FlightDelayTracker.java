package com.example.project;

import com.example.project.enums.StatusDelay;
import com.example.project.model.Delay;

import java.time.LocalTime;

import static com.example.project.enums.StatusDelay.*;

/**
 * Problem 2
 * Design a flight delay tracking system that records delays for various reasons such as
 * technical issues, air traffic congestion, weather, etc.
 * Implement methods to add a delay for a flight, check if a flight is delayed,
 * and get the total delay time for a flight, considering the different delay categories.
 * <p>
 * TIP: every flight must be represented by a flight number which is usually a string eg. EK1723
 */

public class FlightDelayTracker {

    public StatusDelay add(StatusDelay statusDelay, Delay delay) {
        LocalTime hourNow = delay.setTimeNow(
                LocalTime.of(delay.getHour(), delay.getMinutes()));

        switch (statusDelay) {
            case TECHNICAL_ISSUE:
                LocalTime technicalIssueDelay = LocalTime.of(10, 0);
                LocalTime totalHoursTechnicalIssue =
                        hourNow
                                .plusHours(technicalIssueDelay.getHour())
                                .plusMinutes(technicalIssueDelay.getMinute());

                delay.setStatusDelay(TECHNICAL_ISSUE);
                delay.setTimeDelay(totalHoursTechnicalIssue);

                System.out.println("Number of ticket: " + delay.getTicket());
                System.out.println("This the total minutes you should wait: " + totalHoursTechnicalIssue);
                break;

            case AIR_TRAFFIC_CONGESTION:
                LocalTime airTrafficDelay = LocalTime.of(5, 0);
                LocalTime totalHoursAirTraffic =
                        hourNow
                                .plusHours(airTrafficDelay.getHour())
                                .plusMinutes(airTrafficDelay.getMinute());

                delay.setStatusDelay(AIR_TRAFFIC_CONGESTION);
                delay.setTimeDelay(totalHoursAirTraffic);

                System.out.println("Number of ticket: " + delay.getTicket());
                System.out.println("This the total minutes you should wait: " + totalHoursAirTraffic);
                System.out.println("We have a delay of: " + delay.getStatusDelay());
                break;

            case WEATHER:
                LocalTime watherDelay = LocalTime.of(3, 0);
                LocalTime totalWatherHours =
                        hourNow
                                .plusHours(watherDelay.getHour())
                                .plusMinutes(watherDelay.getMinute());

                delay.setStatusDelay(WEATHER);
                delay.setTimeDelay(totalWatherHours);

                System.out.println("Number of ticket: " + delay.getTicket());
                System.out.println("This the total minutes you should wait: " + totalWatherHours);
                System.out.println("We have a delay of: " + delay.getStatusDelay());
                break;

            case OTHERS:
                LocalTime othersDelay = LocalTime.of(1, 0);
                LocalTime totalHoursOthers =
                        hourNow
                                .plusHours(othersDelay.getHour())
                                .plusMinutes(othersDelay.getMinute());

                delay.setStatusDelay(OTHERS);
                delay.setTimeDelay(totalHoursOthers);

                System.out.println("Number of ticket: " + delay.getTicket());
                System.out.println("This the total minutes you should wait: " + totalHoursOthers);
                System.out.println("We have a delay of: " + delay.getStatusDelay());

            default:
                break;
        }

        return delay.getStatusDelay();
    }

}

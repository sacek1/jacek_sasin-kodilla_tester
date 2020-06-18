package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departure != null ? !departure.equals(flight.departure) : flight.departure != null) return false;
        return arrival != null ? arrival.equals(flight.arrival) : flight.arrival == null;

    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        return result;
    }

    private String departure;
    private String arrival;

    public Flight(String departure, String arrival) {

        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

}

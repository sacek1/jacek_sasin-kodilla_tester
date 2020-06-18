package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlightRepository {

    List<Flight> flightList = new ArrayList<>();

    public Flight addFlight (String departure, String arrival) {

        Flight tempFlight = new Flight(departure, arrival);

        if (departure == arrival) {
            System.out.println("The flight must take place between two different airports.");
            return null;
        } else {
            flightList.add(tempFlight);
            System.out.println("The flight has been added to the list");
            return tempFlight;
        }
    }

    public List<Flight> airportFlightList(String airport) {
        List<Flight> airportFlights = new ArrayList<>();
        for(int i = 0; i < flightList.size(); i++) {
            if (flightList.get(i).getArrival() == airport || flightList.get(i).getDeparture() == airport) {
                airportFlights.add(flightList.get(i));

            }
        }
        return airportFlights;
    }

    public void getFlightTable(String airport) {
        for(int i = 0; i < airportFlightList(airport).size(); i++) {
            System.out.println(airportFlightList(airport).get(i).getDeparture() + " - " + airportFlightList(airport).get(i).getArrival());
        }
    }

    public void showFlightList() {
        for(int i = 0; i < flightList.size(); i++) {
            System.out.println(flightList.get(i).getDeparture() + " - " + flightList.get(i).getArrival());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightRepository that = (FlightRepository) o;
        return Objects.equals(flightList, that.flightList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightList);
    }


}

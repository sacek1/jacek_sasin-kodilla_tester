package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder extends FlightRepository {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> depFrom = new ArrayList<>();
        for(int i = 0; i < flightList.size(); i++) {
            if (flightList.get(i).getDeparture().equalsIgnoreCase(departure)) {
                depFrom.add(flightList.get(i));
            }
        }
        return depFrom;
    }

    public void getFlightsFrom(String departure) {
        for(int i = 0; i < findFlightsFrom(departure).size(); i++) {
            System.out.println(findFlightsFrom(departure).get(i).getDeparture() + " - " + findFlightsFrom(departure).get(i).getArrival());
        }
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> depFrom = new ArrayList<>();
        for(int i = 0; i < flightList.size(); i++) {
            if (flightList.get(i).getArrival() == arrival) {
                depFrom.add(flightList.get(i));
            }
        }
        return depFrom;
    }

    public void getFlightsTo(String arrival) {
        for(int i = 0; i < findFlightsTo(arrival).size(); i++) {
            System.out.println(findFlightsTo(arrival).get(i).getDeparture() + " - " + findFlightsTo(arrival).get(i).getArrival());
        }
    }



}

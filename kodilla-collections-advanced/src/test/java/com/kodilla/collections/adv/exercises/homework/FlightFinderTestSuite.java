package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> findFlightsFrom = new ArrayList<>();
        //when
        Flight f001 = flightFinder.addFlight("Warsaw", "Moscow");
        //then
        assertEquals(1, findFlightsFrom.size());
    }
}

//    Flight f001 = flightFinder.addFlight("Warsaw", "Moscow");
//    Flight f002 = flightFinder.addFlight("Oslo", "Warsaw");
//    Flight f003 = flightFinder.addFlight("Berlin", "Moscow");
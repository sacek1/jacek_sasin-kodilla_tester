package com.kodilla.collections.adv.exercises.homework;

public class FlightApplication {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();



        Flight f001 = flightFinder.addFlight("Warsaw", "London");
        flightFinder.showFlightList();
        Flight f002 = flightFinder.addFlight("Paris", "Madrid");
        flightFinder.showFlightList();
        Flight f003 = flightFinder.addFlight("Warsaw", "Warsaw");
        flightFinder.showFlightList();
        Flight f004 = flightFinder.addFlight("Warsaw", "Moscow");
        Flight f005 = flightFinder.addFlight("Oslo", "Warsaw");
        Flight f006 = flightFinder.addFlight("Berlin", "Moscow");
        flightFinder.showFlightList();
        System.out.println("---");
        flightFinder.getFlightTable("Warsaw");
        System.out.println("---");


        flightFinder.getFlightsFrom("Warsaw");
        flightFinder.getFlightsTo("Warsaw");
    }
}

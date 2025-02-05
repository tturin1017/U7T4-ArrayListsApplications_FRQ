package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

import com.example.project.Airport.Airport;
import com.example.project.Airport.Flight;

import static org.junit.jupiter.api.Assertions.*;

public class TestAirport{

    @Test
    public void testRevenuePARTA(){
        Flight f0 = new Flight(25, 50.00, 30);
        Flight f1 = new Flight(10, 100.50, 60);
        Flight f2 = new Flight(20, 100.00, 120);
        Flight f3 = new Flight(50, 200.00, 40);
        ArrayList<Flight> allFlights = new ArrayList<Flight>(Arrays.asList(f0, f1, f2, f3));
        Airport capitalHub = new Airport(allFlights);
        double revenue = capitalHub.getTotalRevenue();
        assertEquals(revenue,12255.0);
    }

    @Test
    public void testUpdateFlightsPARTB(){
        Flight f0 = new Flight(25, 50.00, 30);
        Flight f1 = new Flight(10, 100.50, 60);
        Flight f2 = new Flight(20, 100.00, 120);
        Flight f3 = new Flight(50, 200.00, 40);
        ArrayList<Flight> allFlights = new ArrayList<Flight>(Arrays.asList(f0, f1, f2, f3));
        Airport capitalHub = new Airport(allFlights);
        int passengersWithRemovedFlights = capitalHub.updateFlights();
        assertEquals(passengersWithRemovedFlights,30);
    }
    
    @Test
    public void testUpdateAllFlights(){
        Flight f0 = new Flight(25, 50.00, 30);
        Flight f1 = new Flight(10, 100.50, 60);
        Flight f2 = new Flight(20, 100.00, 120);
        Flight f3 = new Flight(50, 200.00, 40);
        ArrayList<Flight> allFlights = new ArrayList<Flight>(Arrays.asList(f0, f1, f2, f3));
        Airport capitalHub = new Airport(allFlights);
        int passengersWithRemovedFlights = capitalHub.updateFlights();
        ArrayList<Flight> expectedAllFlightsPostUpdate = new ArrayList<Flight>(Arrays.asList(f0, f3));
        ArrayList<Flight> actualAllFlightsPostUpdate = capitalHub.getAllFlights();
        assertEquals(expectedAllFlightsPostUpdate,actualAllFlightsPostUpdate);
    }
    





}



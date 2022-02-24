import java.util.*;

//created the Flight interface

public final class FlightManager {
    private static FlightManager myInstance;
    private static List<Flight> flights;
    private int passengerCapacity;

    //private constructor
    private FlightManager() {
        flights = new ArrayList<Flight>();
    }

    //public method for returning instance
    public static FlightManager getInstance() throws NullPointerException {
        if(myInstance == null) {
            myInstance = new FlightManager();
        }
    return myInstance;
    }

    //createFlight function, adds resulting flight to 'flights' list
    public String createFlight(String type, Airline airline, Airport origin, Airport destination) {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination, passengerCapacity);
        flights.add(flight);

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }
}

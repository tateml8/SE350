import java.util.*;

//created the Flight interface

public final class FlightManager implements Flight {
    private static FlightManager myInstance;
    private static List<Flight> flights;
    private int passengerCapacity;

    //private constructor
    FlightManager() {
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
    public Optional<Flight> getPassengerCapacity(int passengerCapacity) {
        return flights.stream()
                .filter(flt -> flt.getPassengerCapacity() == (passengerCapacity))
                .findFirst();
    }

    @Override
    public String getFlightNumber() {
        return null;
    }

    @Override
    public int getPassengerCapacity() {
        return 0;
    }

    @Override
    public String getAirlineName() {
        return null;
    }

    @Override
    public String getAirportName() {
        return null;
    }

    @Override
    public boolean isAtEnd(FlightManager flights) {
        return flights.isAtEnd(flights);
    }
}

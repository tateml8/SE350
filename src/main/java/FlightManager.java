import java.util.*;

//created the Flight interface

public final class FlightManager implements Flight {
    private TravelManager flight;

    private List<CommercialFlight> flights;

    //private constructor
    private FlightManager() {
        //setFlight(flight);
    }

    /*private void setFlight(TravelManager flight) {
        if (flight == null) {
            throw new NullPointerException("Null");
        }
        this.flight = flight;
    }*/

    private static FlightManager instance;

    //public method for returning instance
    public static FlightManager getInstance() throws NullPointerException {
        if(instance == null) {
            instance = new FlightManager();
        }
    return instance;
    }

    //createFlight function, adds resulting flight to 'flights' list
    public void createFlight() {
        List<CommercialFlight> flights = new ArrayList<>();
        for (CommercialFlight commercialFlight : flights) {
            System.out.println(commercialFlight);
        }
    }


    //getFlightByNumber function, searches flight list for Flight, returns, else exception
    public void getFlightByNumber(int flightNum) {
        //for (List<CommercialFlight> flight : flightNum) {
            if (flight.equals(flights)) {
                return;
            }
            else {
                throw new IllegalArgumentException("Invalid");

        }

    }


    public void setFlights(List<CommercialFlight> flights) {
        this.flights = flights;
    }
}

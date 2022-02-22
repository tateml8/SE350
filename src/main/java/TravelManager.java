import java.util.Optional;
public class TravelManager {

    public static void main(String[] args) {
//        // Instantiating two airports
        Airport origin = new Airport("DCA");
        Airport destination = new Airport("ORD");

//        //Instantiating airline
        //Airline airline = new Airline("Southwest");
        Airline airline = new Airline("United");

//      //Instantiating one flight
        //CommercialFlight flight = new CommercialFlight(airline, origin, destination);
        String flightNumber = FlightManager.getInstance().createFlight("commercialFlight",airline, origin,destination);
        Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);

        System.out.println(flight.get());
    }
}
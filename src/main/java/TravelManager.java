import java.util.Optional;
public class TravelManager {

    public static void main(String[] args) {
       // Instantiating two airports
        //Airport origin = new Airport("DCA");
        //Airport destination = new Airport("ORD");
        Airport airportName1 = FlightFactory.getAirport("DCA");
        Airport airportName2 = FlightFactory.getAirport("ORD");



        //Instantiating airline
        Airline aName = FlightFactory.getAirline("United");
        //Airline airline = new Airline("Southwest");
        //Airline airline = new Airline("United");

//      //Instantiating one flight
        //CommercialFlight flight = new CommercialFlight(airline, origin, destination);
        String flightNumber = FlightManager.getInstance().createFlight("commercialFlight",aName, airportName1,airportName2);

        //having trouble adding to main method, attempt below
        //Integer passengerCapacity = FlightManager.getInstance().createFlight("passengerFlight", passengerCapacity);

        Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);

        System.out.println(flight.get());
    }
}
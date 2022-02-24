import java.util.*;
public class FlightFactory {

    private static Map<String, Airline> airlineCache = new HashMap<>();
    private static Map<String, Airport> airportCache = new HashMap<>();

    private FlightFactory() {
    }

    //Caching airline and airport class
    public static Airline getAirline(String getAirlineName) {
        return airlineCache.computeIfAbsent(getAirlineName, newAirline -> new Airline(getAirlineName));
    }

    public static Airport getAirport(String getAirportName) {
        return airportCache.computeIfAbsent(getAirportName, newAirport -> new Airport(getAirportName));
    }

    //commercialFlight and passengerFlight
    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch (NullPointerException e) {
                return null;
            }
        }
            if (type.equals("passengerFlight")) {
                try {
                    return new PassengerFlight (passengerCapacity);
                } catch (NullPointerException e) {
                    return null;
                }
            }
            else return null;
        }
    }
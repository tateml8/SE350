import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TravelManager {

    public static void main(String[] args) {
//        // Instantiating two airports
        Airport airport = new Airport("DCA");
        Airport airport2 = new Airport("ORD");

//        //Instantiating airline
        //Airline airline = new Airline("Southwest");
        Airline airline = new Airline("United");

//      //Instantiating one flight
        Flight flight = new Flight("8uhj-khn", "United", "ORD", "DCA");

        //dummy departure time data
        LocalDateTime flightDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
        String departureTime = flightDateTime.format(format);
        System.out.println("Departure Time: " + departureTime);

        System.out.println(airport);
        System.out.println(airport2);

        System.out.println(airline);

        System.out.println(flight);
    }
}
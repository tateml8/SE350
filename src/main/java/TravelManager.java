
public class TravelManager {

    public static void main(String[] args) {
//        // Instantiating two airports
         Airport airport = new Airport("DCA");
         Airport airport2 = new Airport("ORD");

//        //Instantiating airline
          //Airline airline = new Airline("Southwest");
          Airline airline = new Airline("United");

//      //Instantiating one flight
//      Flight flight = new Flight("Delta",


        System.out.println(airport);
        System.out.println(airport2);

        System.out.println(airline);

        // System.out.println(product2);
       // System.out.println(String.format("Are the two products equal: %s", product2.equals(product3)));
    }
}
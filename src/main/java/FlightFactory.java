public class FlightFactory {

    public static TravelManager getCreateFlight (Object type) {
        TravelManager flight = null;
        if(type.equals(flight)) {
            return new TravelManager();
        }
        return flight;
    }
}

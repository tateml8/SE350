public class ProxyFlightManager implements Flight {

    private static FlightManager realObject;
    @Override
    public boolean isAtEnd(FlightManager flights) {
        System.out.println("A flight is being created.");

        if (realObject == null) {
            realObject = new FlightManager();
        }
        return realObject.isAtEnd(flights);
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



}

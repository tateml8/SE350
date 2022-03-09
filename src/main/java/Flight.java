public interface Flight {
    public String getFlightNumber();
    public int getPassengerCapacity();
    public String getAirlineName();
    public String getAirportName();

    boolean isAtEnd(FlightManager flights);

}

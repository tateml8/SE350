import java.util.*;
public class PassengerFlight implements Flight {

    //member variable
    private int passengerCapacity;

    //constructor
    public PassengerFlight(int passengerCapacity) {
        setPassengerCapacity(passengerCapacity);
        //this.passengerCapacity = passengerCapacity;
    }

    //getter
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    //setter, non-zero integer
    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException("Value not allowed");
        }
        this.passengerCapacity = passengerCapacity;
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
    public String getFlightNumber() {
        return null;
    }

}

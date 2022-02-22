import java.util.*;

public abstract class PassengerFlight implements Flight {

    //member variable
    private int passengerCapacity;

    //constructor
    public PassengerFlight(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
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

}

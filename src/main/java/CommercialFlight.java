import java.lang.constant.Constable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight implements Flight {

    private UUID flightNumber;
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private Date departureTime;

    public CommercialFlight(Airline airline, Airport origin, Airport destination) {
        setFlightNumber();
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setDepartureTime();
    }


    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }
    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public String getAirline() {
        return airline.toString();
    }

    private void setAirline(Airline airline) {
        if (airline == null) {
            throw new NullPointerException("Null value not allowed");
        }
        this.airline = airline;
    }

    public String getOrigin() {
        return origin.toString();
    }

    private void setOrigin(Airport origin) {
        if (origin == null) {
            throw new NullPointerException("Null value not allowed");
        }
        this.origin = origin;
    }

    public String getDestination() {
        return destination.toString();
    }

    private void setDestination(Airport destination) {
        if (destination == null) {
            throw new NullPointerException("Null value not allowed");
        }
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    public void setDepartureTime() {

        this.departureTime = new Date(2022, 03, 02, 05, 28);
    }


    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber=" + getFlightNumber() +
                ", departureTime=" + getDepartureTime() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommercialFlight)) return false;
        CommercialFlight flight = (CommercialFlight) o;
        return flightNumber.equals(flight.flightNumber) && getAirline().equals(flight.getAirline()) && getOrigin().equals(flight.getOrigin()) && getDestination().equals(flight.getDestination()) && getDepartureTime().equals(flight.getDepartureTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, getAirline(), getOrigin(), getDestination(), getDepartureTime());
    }
}
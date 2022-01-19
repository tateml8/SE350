import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Flight {

    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private Date departureTime;

    public Flight(String flightNumber, String airline, String origin, String destination, Date departureTime) {
        setFlightNumber(flightNumber);
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setDepartureTime(departureTime);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        UUID uuid = UUID.randomUUID();
        flightNumber = UUID.randomUUID().toString().replace("-", "");
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        if (airline == null) {
            throw new NullPointerException("Null value not allowed");
        }
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        if (origin == null) {
            throw new NullPointerException("Null value not allowed");
        }
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination == null) {
            throw new NullPointerException("Null value not allowed");
        }
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFlightNumber().equals(flight.getFlightNumber()) && getAirline().equals(flight.getAirline()) && getOrigin().equals(flight.getOrigin()) && Objects.equals(getDestination(), flight.getDestination()) && Objects.equals(getDepartureTime(), flight.getDepartureTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightNumber(), getAirline(), getOrigin(), getDestination(), getDepartureTime());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Airline:", getAirline()));
        sb.append(String.format("%-20s %s%n", "Origin:", getOrigin()));
        sb.append(String.format("%-20s %s%n", "Destination:", getDestination()));
        //sb.append("departureTime", departureTime);
        return sb.toString();
    }
}
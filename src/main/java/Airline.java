import java.util.*;

public class Airline {

    private String airlineName;

    public Airline(String airlineName) {
        setAirlineName(airlineName);
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        if (airlineName == null) {
            throw new NullPointerException("Null value not allowed");
        }
        if (airlineName.length() <= 0 || airlineName.length() > 8) {
            throw new IllegalArgumentException("Prohibited Value: " + airlineName);
        }
        this.airlineName = airlineName;
    }

    public String toString() {
        return "Airline{" + "airlineName=" + getAirlineName() + '\'' + '}';
    }

    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airline other = (Airline) obj;
        if (!getAirlineName().equals(other.getAirlineName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       return Objects.hash(airlineName);
    }

}
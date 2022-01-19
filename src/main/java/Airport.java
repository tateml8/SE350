import java.util.Objects;

public class Airport {

    private String airportName;

    public Airport(String airportName) {
        setAirportName(airportName);
    }

    public String getAirportName() {
        return airportName;
    }

    private void setAirportName(String aName) throws NullPointerException, IllegalArgumentException {
        //if null
        if (aName == null) {
            throw new NullPointerException("Null value not allowed");
        }
        //must consist of 3 alphabetic letters and capitalize letters
        if (aName.length() > 3 || aName.length() < 3) {
            throw new IllegalArgumentException("Prohibited Value: " + aName);
        }
        airportName = aName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airport Name:", getAirportName()));
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airport other = (Airport) obj;
        if (!getAirportName().equals(other.getAirportName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       return Objects.hash(airportName);
    }
}
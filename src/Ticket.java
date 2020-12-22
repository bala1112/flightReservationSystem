import sun.util.calendar.BaseCalendar;

import java.util.Date;

public class Ticket {
    int PNRNumber;
    String from, destination;
    Date departureTime, arrivalTime;

    private Flight flight;
     private Passenger passenger;

    public Ticket(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "PNRNumber=" + PNRNumber +
                ", from='" + from + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", flight=" + flight +
                ", passenger=" + passenger +
                '}';
    }
}
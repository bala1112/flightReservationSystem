import java.time.LocalDateTime;

public class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureTime;
    private String arrivalTime;
   private boolean cancelled;


    private Flight flight;
     private Passenger passenger;

    public Ticket(String pnr, String from, String to, String departureTime, String arrivalTime, boolean cancelled, Flight flight, Passenger passenger) {

    }

    {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    public Ticket(String flight, String passenger, String to, String deprtureTime, String arrivalTime, boolean cancelled, String s, String passenger1) {
    }

    public Ticket(String flight, String passenger) {
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void  cancelTicket(){
        this.cancelled = true;
    }

    public int getFlightDuration(){
        LocalDateTime departureTime = LocalDateTime.parse(this.departureTime);
        LocalDateTime arrivalTime = LocalDateTime.parse(this.arrivalTime);
        int days = arrivalTime.getDayOfMonth() - departureTime.getDayOfMonth();
        int totalHours = (days*24) +(arrivalTime.getHour()-departureTime.getHour());
        return  totalHours;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "pnr='" + pnr + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", cancelled=" + cancelled +
                ", flight=" + flight +
                ", passenger=" + passenger +
                '}';
    }
}



public class RegularTicket extends  Ticket{
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, boolean cancelled, String deprtureTime, String arrivalTime, Flight flight, Passenger passenger, String specialServices) {
        super(pnr,from,to,deprtureTime,arrivalTime,cancelled,flight,passenger,specialServices);
        this.specialServices = specialServices;
    }



    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}

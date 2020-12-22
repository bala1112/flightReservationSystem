public class RegularTicket extends  Ticket{
    private String specialServices;

    public RegularTicket(Flight flight, Passenger passenger) {
        super(flight, passenger);
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}

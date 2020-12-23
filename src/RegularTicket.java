public class RegularTicket extends  Ticket{
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, boolean cancelled, String flight, String deprtureTime, String arrivalTime, String passenger) {
        super(pnr,from,to,deprtureTime,arrivalTime,cancelled,flight,passenger);
    }



    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}

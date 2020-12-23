public class TouristTicket extends Ticket{
    private  String hotelAddress;
    private String[] slectedTouristLocations;

    public TouristTicket(String pnr, String from, String to, boolean cancelled, String departureTime, String arrivalTime, Flight flight, Passenger passenger, String hotelAddress, String[] slectedTouristLocations) {
        super(pnr,from,to,cancelled,departureTime,arrivalTime,flight, passenger,hotelAddress,slectedTouristLocations);
        this.hotelAddress = hotelAddress;
        this.slectedTouristLocations = slectedTouristLocations;
    }


    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSlectedTouristLocations() {
        return slectedTouristLocations;
    }

    public void setSlectedTouristLocations(String[] slectedTouristLocations) {
        this.slectedTouristLocations = slectedTouristLocations;
    }
}



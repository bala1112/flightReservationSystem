public class TouristTicket extends Ticket{
    private  String hotelAddress;
    private String[] slectedTouristLocations;

    public TouristTicket(Flight flight, Passenger passenger, String hotelAddress, String[] slectedTouristLocations) {
        super(flight, passenger);
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



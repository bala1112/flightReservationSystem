public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("venkat", "vijayawada", "AP", "Bala", "9542859519", "balapavan1018@gmail.com");


        Flight flight;
        flight = new Flight("1112", "bala airlines", 150, 30);

        RegularTicket regularTicket = new RegularTicket("1234", "bala", "1234", false, "22/12/20", "23/12/20",flight, passenger,"Food");

        String hotelAddress = "Hotel sai,mg road,vijayawada";
        String[] locations = {"coorg","lambasingi"};

TouristTicket touristTicket = new TouristTicket("1234", "bala", "1234", false,"22/12/20","23/12/20",flight, passenger,hotelAddress,locations);

printTicketDetails(regularTicket);
printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }


}
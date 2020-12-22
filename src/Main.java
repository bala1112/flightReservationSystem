
public class Main {
    public static void main(String[] args) {
Passenger passenger = new Passenger("venkat","vijayawada","AP","Bala","9542859519","balapavan1018@gmail.com");
        System.out.println(passenger.toString());
        Flight flight = new Flight("1112","bala airlines",150,30);

    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}

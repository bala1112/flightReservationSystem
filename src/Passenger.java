import com.sun.jndi.cosnaming.IiopUrl;

public class Passenger {
    private  static  int idCounter = 0;
    private  int id;
    private  static  class Address{
        string street,city,state;

        public Address(String street,String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class contact{
        String name,phone, emial;
        public Contact(String name, phone, emial){
            this.name = name;
            this.phone = phone;
            this.emial = email;

        }
    }

    private  Contact contact;
    private  Address address;

    public Passenger(String street,String city,String state, String name, String phone , String mail){
        this.id = ++idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,phone,email);
    }

    public int getId() {
        return this.id;
    }

    public Address getAddress() {
        return "Street :" + contact.name + "Number : " + contact.phone + "Email : " + conta+.email;
    }

    public static int getPassengerCount() {
        return idCounter;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }
}

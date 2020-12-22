

public class Passenger {
    private int idCounter = 0;
    private int id;


    private static class Address {
        String street;
        String city;
        String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact {
        private static int idCounter;
        String name, phone, email;
        private int id;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;

        }
    }


        private Contact contact;
        private Address address;

        public  Passenger(String street, String city, String state, String name, String phone,String email) {
            this.id = ++idCounter;
            this.address = new Address(street,city,state);
            this.contact = new Contact(name,phone,email);
        }

        public int getId() {
            return this.id;
        }

        public String getAddress() {
            return "Street :" + contact.name + "Number : " + contact.phone + "Email : " + contact.email;
        }

        public  int getPassengerCount() {
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



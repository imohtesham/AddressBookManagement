public class CreatingContact {
    //Ability to create a Contacts in Address
    //Book with first and last names, address,
    //city, state, zip, phone number and
    //email...
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        int zipCode;
        String phoneNumber;

    CreatingContact(String firstName, String lastName, String address, String city, String state, int zipCode,
                    String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "AddressBookMain [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
                    + city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + "]";
        }

        public static void main(String[] args) {
            CreatingContact addressBook = new CreatingContact("ibrahim", "mohd", "Hi-tech", "Hyd", "Maharastra", 500053,
                    "6865457668");
            System.out.println(addressBook);
        }


}
public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("....WELCOME TO ADDRESS BOOK....");
        Contacts newContact = new Contacts();
        newContact.setFirstName("Ibrahim \n");
        newContact.setLastName("Mohd \n");
        newContact.setAddress("hi tech  \n");
        newContact.setCity("Hyderabad \n");
        newContact.setState("Telangana \n");
        newContact.setZip(516106);
        newContact.setEmail("ibrahim83@gmail.com \n");
        newContact.setPhoneNumber(1234567890);
        System.out.println("The Contact is : " + newContact);

        // To add new contact
        AddressBook addressBook = new AddressBook();
        addressBook.operation();
        addressBook.add();
        addressBook.delete();
        addressBook.edit();
        addressBook.sortCity();
        addressBook.sortState();
        addressBook.countList();

    }
}
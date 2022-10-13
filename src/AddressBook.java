import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
    static ArrayList<CreatingContact> persons = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int counter;
    private static int indexOfPerson;


    public static void readData() {
        System.out.println("Add person details...");
        CreatingContact person = new CreatingContact();

        System.out.println("Enter person first  name: ");
        person.getFirstName(scanner.next());
        System.out.println("Enter person last name: ");
        person.setLastName(scanner.next());
        System.out.println("Enter mobile number: ");
        person.setPhoneNumber(scanner.next());
        System.out.println("Enter address Details: ");
        System.out.println("Enter address: ");
        person.setAddress(scanner.next());
        System.out.println("Enter city: ");
        person.setCity(scanner.next());
        System.out.println("Enter State name: ");
        person.setState(scanner.next());
        System.out.println("Enter zip: ");
        person.setZipCode(scanner.nextInt());

        person.setAddressObj(person);

        persons.add(person);

        System.out.println();
        System.out.println("Person added");
        counter++;

    }


    static void editContactPerson() {
        if (counter > 0) {
            System.out.println("Enter Persons FirstName you want to edit: ");
            String searchName = scanner.next();
            indexOfPerson = 0;
            boolean isFoundPerson = false;

            for (int i = 0; i < persons.size(); i++) {
                if (persons.get(i).getFirstName(searchName).equals(searchName)) {
                    isFoundPerson = true;
                    indexOfPerson = i;
                    break;
                }
            }
            if (isFoundPerson) {

                System.out.print("\nEnter new address: ");
                persons.get(indexOfPerson).getAddressObj().setAddress(scanner.next());
                System.out.println("Enter new city searchName: ");
                persons.get(indexOfPerson).getAddressObj().setCity(scanner.next());
                System.out.println("Enter new zip: ");
                persons.get(indexOfPerson).getAddressObj().setZipCode(scanner.nextInt());
                System.out.println("Enter mobile number: ");
                persons.get(indexOfPerson).setPhoneNumber(scanner.next());
                persons.get(indexOfPerson).getFirstName(searchName);
                System.out.println("Enter Last Name: ");
                persons.get(indexOfPerson).setLastName(scanner.next());
                System.out.println();
                System.out.println("Edit completed");

            } else
                System.out.println("OPPS No person found with this Name");
        } else
            System.out.println("No record Present to edit this contact");

    }

    static void menu() {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of Your choice 1: Add \n 2: Edit \n 3: Display Details  ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    readData();
                    break;
                case 2:
                    editContactPerson();
                    break;
                case 3:
                    System.out.println(persons);
                    break;
                default:
                    System.out.println("Please Enter number between 1 to 3");
            }
        } while (choice < 4);
    }

    public static void main(String[] args) {
        menu();
    }
}
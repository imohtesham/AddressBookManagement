import java.util.Scanner;

public class AddNewContact {
    public AddNewContact(String firstName, String lastName, String address, String city, String state, int zipCode, String phoneNumber) {

    }

    public static AddNewContact readData() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Details of ContactPerson");
            System.out.print("Enter first name: ");
            String firstName = scanner.next();
            System.out.print("Enter Last name: ");
            String lastName = scanner.next();
            System.out.print("Enter Address: ");
            String address = scanner.next();
            System.out.print("Enter the City: ");
            String city = scanner.next();
            System.out.print("Enter the State: ");
            String state = scanner.next();
            System.out.print("Enter the ZipCode: ");
            int zipCode = scanner.nextInt();
            System.out.print("Enter the contact number: ");
            String phoneNumber = scanner.next();

            return new AddNewContact (firstName, lastName, address, city, state, zipCode, phoneNumber);
        }

        static void menu() {
            AddNewContact contactPerson = null;
            int choice = 0 ;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of your Choice  \n 1 : Add \n 2 : Display ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    readData();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Enter number 1 to 2");
            }
        }

        public static void main(String[] args) {
            menu();
        }
    }


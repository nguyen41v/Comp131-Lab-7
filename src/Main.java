import java.util.Scanner;

public class Main {

    /* This functions should prompt the user to enter information that would
     * populate a visitor. This function should also check for errors in the
     * user's input, and re-prompt them if necessary. The Visitor instance is
     * created in this function and returned.
     */
    public static Visitor inputNewVisitor() {
        // we need this to read from input
        Scanner scanner = new Scanner(System.in);

        // this will get a single integer
        //int i = scanner.nextInt();

        // this will get a single line (as a string)
        //String s = scanner.nextLine();

        // create the new visitlr
        Visitor visitor = new Visitor();

        // ask for and set the email
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        while (!visitor.setEmail(email)) {
            System.out.println("Enter your email:");
            email = scanner.nextLine();
        }

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        while (!(visitor.setName(name))){
            System.out.println("Enter your name:");
            name = scanner.nextLine();
        }

        System.out.println("Enter your phone number:");
        String phoneNumber = scanner.nextLine();
        while (!(visitor.setphoneNumber(phoneNumber))){
            System.out.println("Enter your phone number:");
            phoneNumber = scanner.nextLine();
        }

        System.out.println("Why are you visiting campus?:");
        String purpose = scanner.nextLine();
        while (!(visitor.setPurpose(purpose))){
            System.out.println("Why are you visiting campus?:");
            purpose = scanner.nextLine();
        }

        System.out.println("Where are you visiting from?:");
        String origin = scanner.nextLine();
        while (!(visitor.setOrigin(origin))){
            System.out.println("Where are you visiting from?:");
            origin = scanner.nextLine();
        }

        System.out.println("How many years have you been on this Earth?:");
        String age = scanner.nextLine();
        while (!(visitor.setAge(age))){
            System.out.println("How many years have you been on this Earth?:");
            age = scanner.nextLine();
        }
        return visitor;
    }

    /* In a real scenario, a main() might loop forever asking for users to
     * enter information, then return them all in a list (or save it to file).
     * For this assignment, getting one Visitor is sufficient.
     */
    public static void main(String[] args) {
        Visitor visitor = inputNewVisitor();
        System.out.println();
        System.out.println("Name: " + visitor.getName());
        System.out.println("Age: " + visitor.getAge());
        System.out.println("Visiting from: " + visitor.getOrigin());
        System.out.println("Purpose of visit: " + visitor.getPurpose());
        System.out.println("Email: " + visitor.getEmail());
        System.out.println("Phone Number: " + visitor.getPhoneNumber());
    }
}
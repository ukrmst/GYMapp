
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you an ADMIN or CLIENT? (Type 'ADMIN' for admin access, anything else for client access):");
        String userType = scanner.nextLine().trim();

        if (userType.equalsIgnoreCase("ADMIN")) {

            System.out.println("Welcome, Admin!");
            System.out.println("Please enter your admin credentials:");
            System.out.print("Admin Name: ");
            String adminName = scanner.nextLine();
            System.out.print("Admin ID: ");
            String adminId = scanner.nextLine();

            Admin admin = new Admin(adminName, "N/A", false, adminId);
            System.out.println("Admin logged in successfully!");
            admin.manageGym(); 
        } else {
            System.out.println("Welcome, Client!");
            userRegistration.requestRegistration();
            userRegistration.displayRegisteredUsers();

            if (!userRegistration.getUserList().isEmpty()) {
                User firstUser = userRegistration.getUserList().get(0);

                buyMembership membership = new buyMembership(firstUser);
                membership._buyMembership();

                System.out.println("Membership status for " + firstUser.getName().substring(0, 1).toUpperCase() + firstUser.getName().substring(1) + ": " + (firstUser.getMember() ? "Active" : "Inactive"));

                if (firstUser.getMember()) {
                    System.out.println("Now you can: \n1. Register for training. \n2. Read about our gym. \n3. Exit.");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            trainingRegistration.requestTraining();
                            break;
                        case 2:
                            about.aboutGym();
                            break;
                        case 3:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
            } else {
                System.out.println("No users registered.");
            }
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userRegistration.requestRegistration();
        userRegistration.displayRegisteredUsers();

        if (!userRegistration.getUserList().isEmpty()) {
            User firstUser = userRegistration.getUserList().get(0);

            buyMembership membership = new buyMembership(firstUser);
            membership._buyMembership();

            System.out.println("Membership status for " + firstUser.getName().substring(0, 1).toUpperCase() + firstUser.getName().substring(1) + ": " + (firstUser.getMember() ? "Active" : "Inactive"));

            if (firstUser.getMember()) {
                System.out.println("Now you can: \n1. Register for training. \n2. Read about our gym. \n3. Exit.");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        trainingRegistration.requestTraining();
                        System.out.println("What would you like to do next? \n1. Register for training. \n2. Read about our gym. \n3. Exit.");
                        choice = scanner.nextInt();
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
                        break;
                    case 2:
                        about.aboutGym();
                        System.out.println("What would you like to do next? \n1. Register for training. \n2. Read about our gym. \n3. Exit.");
                        choice = scanner.nextInt();
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
}
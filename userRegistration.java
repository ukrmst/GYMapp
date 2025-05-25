import java.util.ArrayList;
import java.util.Scanner;

public class userRegistration {

    private static ArrayList<User> userlist = new ArrayList<>();

    public static void requestRegistration() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your number:");
        String number = scanner.nextLine();

        User newUser = new User(name, number, false);
        userlist.add(newUser);

        System.out.println(newUser.getName().substring(0, 1).toUpperCase() + newUser.getName().substring( 1) + " registered successfully!\n");
    }

    public static void displayRegisteredUsers() {
        System.out.println("Registered Users:");
        for (User user : userlist) {
            System.out.println("Name: " + user.getName().substring(0, 1).toUpperCase() + user.getName().substring( 1) + ", Number: " + user.getNumber());
        }
    }

    public static ArrayList<User> getUserList() {
        return userlist;
    }
}
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class trainingRegistration {
    public static void requestTraining() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the training registration page!");
        
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        scanner.nextLine(); // consume newline
        System.out.print("Enter time (HH:mm): ");
        String timeInput = scanner.nextLine();

        try {
            int currentYear = LocalDate.now().getYear(); // default year
            LocalDate date = LocalDate.of(currentYear, month, day);
            LocalTime time = LocalTime.parse(timeInput); // e.g. "14:30"
            LocalDateTime dateTime = LocalDateTime.of(date, time);

            System.out.println("You selected: " + dateTime);
            System.out.println("Training registration successful!");
        } catch (Exception e) {
            System.out.println("Invalid input. Try again.");
        }
    }
}

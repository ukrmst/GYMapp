import java.util.Scanner;

public class buyMembership {
    private User user;

    public buyMembership(User user) {
        this.user = user; // Inject the User instance
    }

    public void _buyMembership() {
        if (!user.getMember()) {
            System.out.println("\nMembership status: Inactive. Please pay to buy a membership.");
            System.out.println("Choose a membership plan:");
            System.out.println("1. 1-month membership - $10");
            System.out.println("2. 3-month membership - $25");
            System.out.println("3. 6-month membership - $45");
            System.out.print("Enter your choice (1/2/3): ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected 1-month membership for $10.");
                    break;
                case 2:
                    System.out.println("You selected 3-month membership for $25.");
                    break;
                case 3:
                    System.out.println("You selected 6-month membership for $45.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid membership plan.");
                    _buyMembership();
                    return;
            }
            System.out.print("Do you want to continue Y/N: ");
            Scanner _scanner = new Scanner(System.in);
            String answer = _scanner.nextLine();
        
        
            switch (answer){
            
            case "Y":
            case "y":
                System.out.println("Membership purchased successfully! Membership status: Active.");
                user.isMember = true;
                    break;
            case "N":
            case "n":
                System.out.println("Membership purchase cancelled.");
                    break;
        
            default :
                     System.out.println("invalid choice")   ;
                     _buyMembership(); 
                     break;
            }
        } else {
            System.out.println("Membership status: Active. You are already a member.");
        }
}
}

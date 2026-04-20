import java.util.Scanner;
import service.GymMerchService;
import service.MembershipService;
public class Main {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    static GymMerchService merchService = new GymMerchService();
    static MembershipService membershipService = new MembershipService();
    public static void main(String[] args) {
        adminMenu(); // just to test
    }

    static void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. View Users");
            System.out.println("2. Delete User");
            System.out.println("3. View Membership Revenue");
            System.out.println("4. Add Merchandise");
            System.out.println("5. View Merch Stock Value");
            System.out.println("6. Logout");
    
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer
    
            switch (choice) {
                case 1:
                    System.out.println("Showing users...");
                    break;
    
                case 2:
                    System.out.print("Enter username to delete: ");
                    String user = sc.nextLine();
                    System.out.println("User deleted (placeholder)");
                    break;
    
                case 3:
                    System.out.println("Total revenue: $" + membershipService.getTotalRevenue());
                    break;
    
                case 4:
                    System.out.print("Item name: ");
                    String name = sc.nextLine();
    
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
    
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine(); //  important fix!!!
    
                    merchService.addItem(name, price, stock);
                    break;
    
                case 5:
                    System.out.println("Total stock value: $" + merchService.getStockValue());
                    break;
    
                case 6:
                    System.out.println("Logging out...");
                    return;
    
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

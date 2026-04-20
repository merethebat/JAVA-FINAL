import java.util.Scanner;
import service.GymMerchService;
import service.MembershipService;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static GymMerchService merchService = new GymMerchService();
    static MembershipService membershipService = new MembershipService();

    public static void main(String[] args) {

        System.out.println("LOGIN AS:");
        System.out.println("1. Admin");
        System.out.println("2. Trainer");
        System.out.println("3. Member");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                adminMenu();
                break;

            case 2:
                trainerMenu();
                break;

            case 3:
                memberMenu();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    // ---------------- ADMIN MENU ----------------
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
            sc.nextLine();

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
                    sc.nextLine();

                    merchService.addItem(name, price, stock);
                    break;

                case 5:
                    System.out.println("Total stock value: $" + merchService.getStockValue());
                    break;

                case 6:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- TRAINER MENU ----------------
    static void trainerMenu() {

        while (true) {
            System.out.println("\n--- Trainer Menu ---");
            System.out.println("1. Create Workout Class");
            System.out.println("2. Update Workout Class");
            System.out.println("3. Delete Workout Class");
            System.out.println("4. View My Classes");
            System.out.println("5. Purchase Membership");
            System.out.println("6. Logout");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Class created (placeholder)");
                    break;

                case 2:
                    System.out.println("Class updated (placeholder)");
                    break;

                case 3:
                    System.out.println("Class deleted (placeholder)");
                    break;

                case 4:
                    System.out.println("Showing trainer classes...");
                    break;

                case 5:
                    System.out.println("Membership purchased (placeholder)");
                    break;

                case 6:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // ---------------- MEMBER MENU ----------------
    static void memberMenu() {

        while (true) {
            System.out.println("\n--- Member Menu ---");
            System.out.println("1. View Workout Classes");
            System.out.println("2. Purchase Membership");
            System.out.println("3. View My Membership Cost");
            System.out.println("4. View Merchandise");
            System.out.println("5. Buy Merchandise");
            System.out.println("6. Logout");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Showing workout classes...");
                    break;

                case 2:
                    System.out.println("Membership purchased (placeholder)");
                    break;

                case 3:
                    System.out.println("Showing total cost...");
                    break;

                case 4:
                    System.out.println("Showing merch...");
                    break;

                case 5:
                    System.out.println("Buying merch (placeholder)");
                    break;

                case 6:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

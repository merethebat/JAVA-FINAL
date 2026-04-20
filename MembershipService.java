package service;

import java.util.ArrayList;
import java.util.Scanner;

public class MembershipService {

    private ArrayList<Double> membershipCosts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void buyMembership() {
        System.out.println("\n--- Membership Options ---");
        System.out.println("1. Basic ($50)");
        System.out.println("2. Premium ($100)");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        double cost;

        if (choice == 1) {
            cost = 50;
        } else if (choice == 2) {
            cost = 100;
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        membershipCosts.add(cost);
        System.out.println("Membership purchased for $" + cost);
    }

    public double getTotalRevenue() {
        double total = 0;

        for (double cost : membershipCosts) {
            total += cost;
        }

        return total;
    }

    public double getUserTotal() {
        // simple version (same as total for now)
        double total = 0;

        for (double cost : membershipCosts) {
            total += cost;
        }

        return total;
    }
}

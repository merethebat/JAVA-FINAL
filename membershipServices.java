package service;

import dao.MembershipDAO;
import java.util.Scanner;

public class membershipServices {

    private MembershipDAO dao = new MembershipDAO();
    private Scanner sc = new Scanner(System.in);

    public void buyMembership() {
        System.out.println("\n1. Basic ($50)");
        System.out.println("2. Premium ($100)");

        int choice = sc.nextInt();

        double cost;

        if (choice == 1) {
            cost = 50;
        } else if (choice == 2) {
            cost = 100;
        } else {
            System.out.println("Invalid option");
            return;
        }

        dao.insertMembership(cost);
        System.out.println("Membership purchased");
    }

    public double getTotalRevenue() {
        return dao.getTotalRevenue();
    }

    public double getUserTotal() {
        return dao.getTotalRevenue(); // simple version
    }
}

package dao;

import java.util.ArrayList;

public class MembershipDAO {

    private ArrayList<Double> memberships = new ArrayList<>();

    public void insertMembership(double cost) {
        memberships.add(cost);
    }

    public double getTotalRevenue() {
        double total = 0;

        for (double c : memberships) {
            total += c;
        }

        return total;
    }
}
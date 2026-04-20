package service;

import java.util.ArrayList;

public class GymMerchService {

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Double> prices = new ArrayList<>();
    private ArrayList<Integer> stock = new ArrayList<>();

    public void addItem(String name, double price, int qty) {
        names.add(name);
        prices.add(price);
        stock.add(qty);

        System.out.println("Item added");
    }

    public void viewItems() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - $" + prices.get(i));
        }
    }

    public double getStockValue() {
        double total = 0;

        for (int i = 0; i < names.size(); i++) {
            total += prices.get(i) * stock.get(i);
        }

        return total;
    }
}
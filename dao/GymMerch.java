package dao;

public class GymMerch {
    private int id;
    private String name;
    private double price;
    private int stock;

    public GymMerch(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
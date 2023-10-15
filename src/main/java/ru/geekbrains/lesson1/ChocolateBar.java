package ru.geekbrains.lesson1;


public class ChocolateBar extends Product {

    /**
     * Вес нетто плитки шоколада
     */
    private double weight;

    public double getWeight() {
        return weight;
    }

    public ChocolateBar(String brand, String name, double price, double weight){
        super(brand, name, price);
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Плитка шоколада]\n%s - %s - %.2f;\nВес нетто: %.1f",
                brand, name, price, weight);
    }
}

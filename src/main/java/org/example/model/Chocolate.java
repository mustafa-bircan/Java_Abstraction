package org.example.model;

public class Chocolate extends ProductForSale {
    private final int cocoaPercentage;

    public Chocolate(double price, String description, int cocoaPercentage) {
        super("Chocolate", price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate - " + getDescription());
        System.out.println("Price: " + getPrice() + " USD");
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
    }
}


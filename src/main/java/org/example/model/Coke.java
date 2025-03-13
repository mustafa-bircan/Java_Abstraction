package org.example.model;

public class Coke extends ProductForSale {
    private boolean isDiet;

    public Coke(double price, String description, boolean isDiet) {
        super("Coke", price, description);
        this.isDiet = isDiet;
    }

    public boolean isDiet() {
        return isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke - " + getDescription());
        System.out.println("Price: " + getPrice() + " USD");
        System.out.println("Diet: " + (isDiet ? "Yes" : "No"));
    }
}

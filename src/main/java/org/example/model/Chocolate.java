package org.example.model;

public class Chocolate extends ProductForSale {
    private final boolean isDiet;

    public Chocolate(String type, double price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    public boolean isDiet(){
        return isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke - " + getDescription());
        System.out.println("Price: " + getPrice() + " USD");
        System.out.println("Diet: " + (isDiet ? "Yes" : "No"));
    }
}

package org.example.model;

public class Bread extends ProductForSale{
    private  String flourType;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread - " + getDescription());
        System.out.println("Price: " + getPrice() + " USD");
        System.out.println("Flour Type: " + flourType);
    }

    public String getFlourType() {
        return flourType;
    }
}

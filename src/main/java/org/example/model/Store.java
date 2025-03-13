package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = {
                new Chocolate(5.99, "Dark Chocolate", 70),
                new Coke(1.99, "Refreshing Soda", false),
                new Bread("Whole Grain Bread",2.49 , "Whole Wheat")
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("***********************");
        }
    }
}
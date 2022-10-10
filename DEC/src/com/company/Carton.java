package com.company;

public class Carton extends Decorator {
    public Carton(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Carton";
    }

    public double cost() {
        return 2000 + product.cost();
    }
}
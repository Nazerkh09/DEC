package com.company;

public class YourDesign extends Decorator {
    public YourDesign(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Print";
    }

    public double cost() {
        return 10000 + product.cost();
    }
}
package com.company;

public class PaperBags extends Decorator {
    public PaperBags(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", Paper Bags";
    }

    public double cost() {
        return 500 + product.cost();
    }
}
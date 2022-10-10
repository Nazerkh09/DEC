package com.company;

public class GiftWrap extends Decorator {
    public GiftWrap(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + ", GiftWrap";
    }

    public double cost() {
        return 10000 + product.cost();
    }
}
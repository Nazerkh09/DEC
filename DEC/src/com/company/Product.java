package com.company;

public abstract class Product {
    String description = "Products";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}


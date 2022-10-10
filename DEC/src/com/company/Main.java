package com.company;

public class Main {

    public static void main(String[] args) {
        Product product = new Bomber();
        product = new PaperBags(product);
        System.out.println(product.getDescription()
                + " " + product.cost() + " tg");

        Product product2 = new Hoodie();
        product2 = new Carton(product2);
        product2 = new YourDesign(product2);
        System.out.println(product2.getDescription()
                + " " + product2.cost() + " tg");

        Product product3 = new Jeans();
        product3 = new Carton(product3);
        product3 = new GiftWrap(product3);
        System.out.println(product3.getDescription()
                + " " + product3.cost() + " tg");
    }
}

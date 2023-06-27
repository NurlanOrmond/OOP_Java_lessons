package org.example;

public class Worker extends Personages {

    public Worker(String name, int enegry) {
        super(name, enegry);
    }

    String product;
    int productVolume;

    public Worker(String name, int enegry, String product, int productVolume) {
        super(name, enegry);
        this.product = product;
        this.productVolume = productVolume;
    }

    int startWork() {
        return productVolume += 10;
    }

}


package ru.job4j.oop.shop;

public final class LiquidationProduct {
    private Product product;

    public LiquidationProduct(Product product) {
        this.product = product;
    }

    public int discount() {
        return 90;
    }

    public String label() {
        return product.label();
    }
}

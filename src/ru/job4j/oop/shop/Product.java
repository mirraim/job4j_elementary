package ru.job4j.oop.shop;

public final class Product {

    private String name;
    private int price;
    private LiquidationProduct liquidationProduct;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setLiquidationProduct(LiquidationProduct liquidationProduct) {
        this.liquidationProduct = liquidationProduct;
    }

    public int price() {
        if (liquidationProduct != null) {
            return price - liquidationProduct.discount();
        }
        return price - discount();
    }

    public int discount() {
        return 0;
    }

    public String label() {
        return name + " " + price();
    }
}

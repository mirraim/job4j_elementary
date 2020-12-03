package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Bus rides");
    }

    @Override
    public void passengers(int number) {
        System.out.println("There are " + number + " passengers on the bus");
    }

    @Override
    public int fill(int quantity) {
        System.out.println("Bus is filled");
        return quantity;
    }
}

package com.laibao.chapter2;

public class JavaVersionCar {
    private final int year;

    private int miles;

    public JavaVersionCar(int yearOfMake) {
        this.year = yearOfMake;
    }

    public void drive(int distance) {
        miles += Math.abs(distance);
    }

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }
}

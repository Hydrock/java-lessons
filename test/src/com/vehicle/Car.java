package com.vehicle;

public class Car {
    int doors = 0;

    public Car(int count) {
        this.doors = count;
    }

    public void echo() {
        System.out.println(doors);
    }
}

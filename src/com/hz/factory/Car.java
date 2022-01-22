package com.hz.factory;

public class Car implements Transport {

    public String getTypeOfTransport() {
        return "car";
    }

    public double getFuelPrice() {
        return 0.3;
    }
}

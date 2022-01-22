package com.hz.factory;

public class Boat implements Transport {

    public String getTypeOfTransport() {
        return "boat";
    }

    public double getFuelPrice() {
        return 0.6;
    }
}

package com.hz.factory;

public class Plane implements Transport {

    public String getTypeOfTransport() {
        return "plane";
    }

    public double getFuelPrice() {
        return 0.9;
    }
}

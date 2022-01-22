package com.hz.factory;

public class CarCreator extends TransportCreator {

    @Override
    public Transport getTransport() {
        return new Car();
    }

    @Override
    public double getPrice() {
        return 0.3;
    }
}

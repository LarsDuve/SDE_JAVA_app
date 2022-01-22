package com.hz.factory;

public class BoatCreator extends TransportCreator {

    @Override
    public Transport getTransport() {
        return new Boat();
    }

    @Override
    public double getPrice() {
        return 0.6;
    }
}

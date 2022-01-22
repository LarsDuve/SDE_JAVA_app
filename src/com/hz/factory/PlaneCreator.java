package com.hz.factory;

public class PlaneCreator extends TransportCreator {

   @Override
   public Transport getTransport() {
       return new Plane();
   }
    @Override
    public double getPrice() {
        return 0.9;
    }
}

package com.hz.facade;

import com.hz.factory.Transport;

public class TravelFacade {

    public static void startTravel(String distance, double fuelPrice) {
        double cost = Double.parseDouble(distance) * fuelPrice;
        System.out.println("Your travel costs are: €" + cost);
    }

}
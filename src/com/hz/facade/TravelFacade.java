package com.hz.facade;

import com.hz.strategy.CalculatorContext;
import com.hz.strategy.MultiplicationOperationStrategy;

public class TravelFacade {

    public static void startTravel(int distance, double fuelPrice, double choiceDiscount) {

        CalculatorContext discountOnFuel = new CalculatorContext(new MultiplicationOperationStrategy(fuelPrice, choiceDiscount, distance));

    }

}
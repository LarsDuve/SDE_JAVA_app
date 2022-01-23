package com.hz.strategy;

public final class MultiplicationOperationStrategy extends AbstractOperationStrategy {

    public MultiplicationOperationStrategy(double basePrice, double discount, int distance){
        super(basePrice, discount, distance);
    }

    @Override
    public void compute() {

        System.out.println((getBasePrice() * getDistance()) * ((100 - getDiscount()) / 100));
    }
}
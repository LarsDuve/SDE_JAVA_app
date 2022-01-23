package com.hz.strategy;

public abstract class AbstractOperationStrategy implements IOperationStrategy {

    private final double basePrice;
    private final double discount;
    private final int distance;

    public AbstractOperationStrategy(double basePrice, double discount, int distance){
        this.basePrice = basePrice;
        this.discount = discount;
        this.distance = distance;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getDiscount() {
        return discount;
    }

    public int getDistance() {
        return distance;
    }
}


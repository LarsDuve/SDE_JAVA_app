package com.hz.strategy;

public abstract class AbstractOperationStrategy implements IOperationStrategy {

    private final double basePrice;
    private final double discount;

    public AbstractOperationStrategy(double basePrice, double discount){
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getDiscount() {
        return discount;
    }
}
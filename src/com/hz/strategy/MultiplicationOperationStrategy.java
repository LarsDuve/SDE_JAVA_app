package com.hz.strategy;

public final class MultiplicationOperationStrategy extends AbstractOperationStrategy {

    public MultiplicationOperationStrategy(double basePrice, double discount){
        super(basePrice, discount);
    }

    @Override
    public void compute() {
        System.out.println((getBasePrice() * 10) * (100 - getDiscount()));
    }
}
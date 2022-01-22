package com.hz.strategy;

public final class MinusOperationStrategy extends AbstractOperationStrategy{

    public MinusOperationStrategy(double basePrice, double discount) {super(basePrice, discount);}

    @Override
    public void compute() {
        System.out.println(getBasePrice() - getDiscount());
    }
}
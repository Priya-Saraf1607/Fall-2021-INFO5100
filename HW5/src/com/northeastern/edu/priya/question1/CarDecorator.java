package com.northeastern.edu.priya.question1;

public class CarDecorator implements ICar {
    protected ICar car;

    public CarDecorator(ICar car){
        this.car = car;
    }

    @Override
    public void assemble(){
        this.car.assemble();
    }
}

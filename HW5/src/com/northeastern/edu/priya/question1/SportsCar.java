package com.northeastern.edu.priya.question1;

public class SportsCar extends CarDecorator{
    public SportsCar(ICar car){
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}

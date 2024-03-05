package com.Demo;

public class BicycleDemo{
    public static void main(String[] args) {
        // Create two different bicycle objects
        Bicycle bike1 = new Bicycle();
         Bicycle bike2 = new Bicycle();
         //invoke methods on those objects
         bike1.changeCadence(50);
         bike1.speedUp(10);
         bike1.changeGear(2);
         bike1.printState();

         bike2.changeCadence(50);
         bike2.speedUp(10);
         bike2.changeGear(2);
         bike2.changeGear(2);
         bike1.printState();
    }
}
         

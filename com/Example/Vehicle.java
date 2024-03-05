package com.Example;
public class Vehicle {
    private String brand;
    private int year;
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void start() {
        System.out.println("the vehicle is starting ");
    }
    public void stop() {
        System.out.println("the vehicle is stopping ");
    }
    public void displayinfo() {
        System.out.println("Brand" + brand);
        System.out.println("Year" + year);
    }
}
class Car extends Vehicle {
    private String model;
    public Car(String brand,int year,String model) {
        super(brand,year);
        this.model = model;
    }
    public void accelerate() {
        System.out.println("the car accelerating");
    }
        public void brake () {
            System.out.println("the car is braking");
        }
        @Override
        public void displayinfo() {
            super.displayinfo();
            System.out.println("model: " + model);
        }
    }





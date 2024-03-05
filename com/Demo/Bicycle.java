package com.Demo;
public class Bicycle {
int cadence = 0;
int speed = 0;
int gear = 0;
void changeCadence(int newValue) {
    cadence = newValue;
}
void changeGear(int newValue) {
    gear = newValue;
}
void speedUp(int increment) {
    speed = speed + increment;
}
void applyBrakes(int decrement) {
    speed = speed - decrement;
}
void printState(){
    System.out.println("Speed: " + speed  +  "cadence"   +  cadence +  "gear"  +  gear);
}
}

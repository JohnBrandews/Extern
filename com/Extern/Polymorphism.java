package com.Extern;

public class Polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
         dog.makeSound();
         cat.makeSound();
    }
}

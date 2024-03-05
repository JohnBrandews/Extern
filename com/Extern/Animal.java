package com.Extern;
public class Animal {
    public void makeSound() {
        System.out.println("some sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("woof!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow!");
    }
}



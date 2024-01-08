package model;

import interfaces.Animal;

public class Cat implements Animal {

    public void eat() {
        System.out.println("the cat eats raw Tuna");

    }

    public void sleep() {
        System.out.println("the cat sleeps all the time");

    }

    public void makeSound() {
        System.out.println("the cat creates an engine sound from her tummy");

    }

}

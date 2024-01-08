package model;

import interfaces.Animal;

public class Dog implements Animal {

    public void eat() {
        System.out.println("the dawg eats raw meat");

    }

    public void sleep() {
        System.out.println("the dawg sleeps if i am not at home");

    }

    public void makeSound() {
        System.out.println("the dawg makes a funny sound when he is hungry");

    }

}

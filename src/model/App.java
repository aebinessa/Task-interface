package model;

import interfaces.Animal;

public class App {
    public static void main(String[] args) throws Exception {

        Dog kira = new Dog();
        Cat nancy = new Cat();
        kira.eat();
        nancy.eat();
        kira.sleep();
        nancy.sleep();
        kira.makeSound();
        nancy.makeSound();

    }
}

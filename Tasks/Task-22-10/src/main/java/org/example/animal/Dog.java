package org.example.animal;

public class Dog extends Animal implements Pet{

    @Override
    public void makeSound() {
        System.out.println("Hav hav");
    }

    @Override
    public void play() {
        System.out.println("Topla oynayir");
    }
}

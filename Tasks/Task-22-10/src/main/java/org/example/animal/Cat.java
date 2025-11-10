package org.example.animal;

public class Cat extends Animal implements Pet{
    @Override
    public void makeSound() {
        System.out.println("Mew mew");
    }

    @Override
    public void play() {
        System.out.println("Yumaqla oynayir");
    }
}

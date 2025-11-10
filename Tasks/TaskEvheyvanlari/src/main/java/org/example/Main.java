package org.example;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("qus");
        System.out.println(bird.play());

        Dog dog = new Dog("it");
        System.out.println(dog.play());

        Cat cat = new Cat("pisik");
        System.out.println(cat.play());
    }
}
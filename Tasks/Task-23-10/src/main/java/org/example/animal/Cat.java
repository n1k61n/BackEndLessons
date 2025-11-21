package org.example.animal;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(super.name + " Meow!");;
    }
}

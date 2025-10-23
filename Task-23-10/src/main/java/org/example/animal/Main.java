package org.example.animal;


//. Task – Animal sistemi
//•	Animal: name, makeSound() (boş metod)
//        •	Dog və Cat sinifləri Animal-dan miras alsın və makeSound() metodunu override etsin:
//o	Dog: “Woof!”
//o	Cat: “Meow!”

import org.example.animal.calculator.Calculator;
import org.example.animal.calculator.ScientificCalculator;
import org.example.animal.print.Book;
import org.example.animal.print.Magazine;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Cat");
//        cat.makeSound();
//        Dog dog = new Dog("Dog");
//        dog.makeSound();

//        Book book = new Book("Romeo ve Julyeta", "Uilyam Sekspir");
//        book.printInfo();
//        Magazine magazine = new Magazine("Life");
//        magazine.printInfo();
        int a = 7, b = 8,c = 9;
        Calculator calculator =  new Calculator();
        System.out.println(calculator.add(a, b));
        System.out.println(calculator.add(a, b, c));
        System.out.println(calculator.add(a, b, c));

        ScientificCalculator sc = new ScientificCalculator();
        System.out.println(sc.add(a,b));
        System.out.println(sc.add(a, b));
        System.out.println(sc.add(a, b, c));


    }
}
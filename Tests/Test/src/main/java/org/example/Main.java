package org.example;


import com.sun.net.httpserver.Request;

import javax.xml.namespace.QName;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;


public class Main {
    static void main() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Emin", 44));
        persons.add(new Person("Orxan", 30));
        persons.add(new Person("Kamran", 21));
        persons.add(new Person("Emil", 15));


        persons.stream()
                .filter(name -> name.getName().equals("Emin"))
                .forEach(System.out::println);




    }

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}



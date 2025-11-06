package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String input = "Kod: 12345, tarix: 2025";
//        Pattern pattern = Pattern.compile("[0-9]+");
//        Matcher matcher = pattern.matcher(input);
//
//        while(matcher.find())
//            System.out.println(matcher.group());
//
//        String input = "Əlaqə: test@example.com və info@site.az";
//        Pattern pattern = Pattern.compile("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}");
//        Matcher matcher = pattern.matcher(input);
//
//        while (matcher.find()) {
//            System.out.println("Tapılan email: " + matcher.group());
//        }

//        String numbers = "1";
//        System.out.println(Regex.isDigit(numbers));

// List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
        String[] color = {"white", "yellow", "purple", "red"};
        Random rnd = new Random();
        System.out.println(rnd.nextInt(color.length));
    }
}



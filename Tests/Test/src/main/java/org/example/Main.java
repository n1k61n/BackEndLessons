package org.example;


import com.sun.net.httpserver.Request;

import javax.xml.namespace.QName;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;


public class Main {
        final static String[] TOY_NAMES = {"Race Car", "Dollhouse", "Lego Set", "Puzzle Mat", "Robot Kit",
                "Water Gun", "Toy Soldier", "Play Dough Tub", "Marble Run", "Kite",
                "Frisbee", "Slime Container", "Drum Set", "Hula Hoop", "Skip Rope"};

        final static String[] COLORS = {"Red", "Blue", "Yellow", "Green", "Pink", "Black", "White", "Purple"};
    static void main(String[] args) {
        String [] arrays = generateInsertStatements(100);
    }

    static String[] generateInsertStatements(int count){
        String[] statements = new String[count];
        for(int i = 0; i < count; i++){
            String toyName = TOY_NAMES[(int)(Math.random() * TOY_NAMES.length)];
            String color = COLORS[(int)(Math.random() * COLORS.length)];

            double price = Math.random() * 100;
            int stock = (int)(Math.random() * 250);
            String sql = "INSERT INTO toys (toys_name, color, price, stock) VALUES ('%s', '%s', %.2f, %s);".formatted(toyName, color, price, stock);
            statements[0] = sql;
            System.out.println(sql);
        }

        return statements;
    }

    public static String toAlternativeString(String string) {
        // your code here!
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append(Character.toUpperCase(c));
            } else if (c >= 'A' && c <= 'Z') {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
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



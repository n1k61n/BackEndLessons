package org.example;


import jdk.dynalink.Operation;
import org.junit.Assert;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Fraction res = new Fraction(10,15);
        System.out.println(res.gcd(10, 15));
    }

//    public static int sum(int a, int b){
//        return a +b;
//    }

    public static String generateRandomName(PhotoManager photoManager){
        Random rnd = new Random();
        String s = "";
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) (rnd.nextInt(26) + 'A'));// A
            }
            s = sb.toString();
        }while(photoManager.nameExists(s));
        return s;
    }

}




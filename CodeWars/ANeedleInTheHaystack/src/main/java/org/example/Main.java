package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] merged = Kata.mergeArrays(new int[] { 2, 4, 8}, new int[] { 2, 4, 6 });
       System.out.println(Arrays.toString( merged));
    }
}


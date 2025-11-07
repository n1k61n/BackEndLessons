package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {"EMin", "Tunar", "Elmira", "Elvira", "Elxan"};
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};


        printArray(names);
        printArray(numbers);



    }

    static <T> void printArray(T[] arr){
        for (T item : arr)
            System.out.print(item + " ");
        System.out.println();
    }
//
//    static void printArray(String[] arr){
//        for(String string : arr)
//            System.out.println(string);
//    }
//
//    static void printArray(int[] arr){
//        for(int i : arr)
//            System.out.println(i);
//    }

}



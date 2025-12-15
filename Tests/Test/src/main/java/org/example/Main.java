package org.example;



public class Main {

    static void main(String[] args){
        Integer [] numbers = {5, 0, -2, 7, 3};
        printArray(numbers);

        String[] words = {"hello", "world", "my", "dear", "friend"};
        printArray(words);
    }


    static <T>void  printArray(T[] arr){
        for(T t : arr){
            System.out.print(t + " ");
        }
        System.out.println();
    }
}



package org.example;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 5};

        for (int i = 1; i < numbers.length; i++) {
            int insertindex = i;
            int currentNumber = numbers[i];
            for (int j = i - 1; j >= 0 && numbers[j] > currentNumber; j--) {
                numbers[j + 1] = numbers[j];
                insertindex = j;
            }
            numbers[insertindex] = currentNumber;
        }

        for(int i : numbers){
            System.out.print(i + " ");
        }
    }
}
package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N = 1000;
        int[] arr = new int[N];
        for(int i = 0; i< N; i++){
            arr[i] = (int)(Math.random() * 100);
        }

//        arr = Arrays.stream(arr).sorted().toArray();
//        bubbleSort(arr);
//        for(int i: arr) System.out.print(i + " ");
        speedTest(arr);
    }


    static void speedTest(int[] arr){
        long startTest = System.nanoTime();
        for(int i = 0; i < 100; i++){
            bubbleSort(arr);
        }
        long finishTest = System.nanoTime();
        long bubleSortResult = finishTest - startTest;

        startTest = System.nanoTime();
        for(int i = 0; i < 100; i++){
            Arrays.stream(arr).sorted().toArray();
        }
        finishTest = System.nanoTime();
        long sortResult = finishTest - startTest;
        System.out.println("Bubble sort: " + bubleSortResult);
        System.out.println("Quick sort: " + sortResult);
    }


    static void mergeSort(int[] arr, int start, int end){
        int mid = arr.length / 2;


    }

    static int[] merge(int[] a, int[] b){
        int size = a.length + b.length;
        int[] newArr = new int[size];
        int i = 0, j = 0;
        int pos = 0;
        while ( i < a.length && j < b.length){
            if(a[i] < b[j]) newArr[pos++] = a[i++];
            else  newArr[pos++] = b[j++];
        }

        while(i < a.length) newArr[pos++] = a[i++];
        while(j < b.length) newArr[pos++] = b[j++];

        return newArr;
    }



    static void bubbleSort(int[] arr){
        int size = arr.length;
        for(int i = 0; i< size; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] > arr[j+1])
                    swap(arr, j, j + 1);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
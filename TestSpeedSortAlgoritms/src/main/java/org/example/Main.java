package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[N];
        for(int i = 0; i< N; i++){
            arr[i] = (int)(Math.random() * 100);
        }

        mergeSort(arr, 0, N-1);
        System.out.println(Arrays.toString(arr));
//        arr = Arrays.stream(arr).sorted().toArray();
//        bubbleSort(arr);
//        for(int i: arr) System.out.print(i + " ");
//        speedTest(arr);
    }

    static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }

    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right)
            temp[k++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        for (int t = 0; t < temp.length; t++)
            nums[left + t] = temp[t];
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
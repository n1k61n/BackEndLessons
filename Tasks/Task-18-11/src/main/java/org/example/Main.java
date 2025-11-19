package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        List<Shape> shapes = new ArrayList<>();
//        shapes.add(new Circle(4));
//        shapes.add(new Triangle(19));
//
//        for(Shape shape   : shapes){
//            System.out.println(shape.calculateArea());
//            System.out.println(shape.calculatePerimetr());
//        }
//        game();

        int [] numbers = {4,3,6,2,8,1,9,0};
        //bubbleSort(numbers);
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid +1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left,int mid, int right) {
        int[] temp = new int[right - left  + 1];
        int i =  left, j = mid + 1, k = 0;
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid) temp[k++] = arr[i++];
        while(j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);
    }


    public static void bubbleSort(int[] numbers){
        for(int i = 0 ; i < numbers.length; i++){
            for(int j = 0; j < numbers.length-i-1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

    }

    public static void game(){
        PLayer one = new PLayer("Emin");
        PLayer two = new PLayer("Tunar");

        int round = 0;
        while(round <= 10){
            round++;
            System.out.println("Round " + round);
            one.setHand();
            two.setHand();
            if(one.beat(two)){
                System.out.println("PLayer 1 win round");
                one.setScore(1);
            }else if(two.beat(one)){
                System.out.println("PLayer 2 win round");
                two.setScore(1);
            }
            else System.out.println("Draw.");
        }

        System.out.printf("Total score:  %s - %s %s - %s\n", one.getName(), one.getScore(), two.getName(), two.getScore());
        if(one.getScore() == two.getScore()) System.out.println("No one win!");
        else if(one.getScore() > two.getScore()) System.out.printf("%s win!", one.getName());
        else System.out.printf("%s win!", two.getName());
    }
}
package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//1.	Bir array verilib: [5, 10, 15, 20, 25].
//Tapşırıq: Arraydəki ədədlərin orta qiymətini hesabla.
//        int[] numbers = {5, 10, 15, 20, 25};
//        int sum  = 0;
//        for(int num : numbers){
//            sum += num;
//        }
//        System.out.println(sum / numbers.length);


//2.	Bir array verilib: [3, 6, 9, 12, 15].
//Tapşırıq: İstifadəçidən bir ədəd soruş, arraydə var ya yox olduğunu yoxla.
//        Scanner input = new Scanner(System.in);
//        int [] numbers = {3, 6, 9, 12, 15};
//        int num = input.nextInt();
//        boolean var = false;
//        for(int el : numbers){
//            if (el == num){
//                var = true;
//            }
//        }
//        System.out.println(var);


//3.	Array verilib: [1, 2, 3, 4, 5]
//Tapşırıq: Bütün elementləri for döngüsü ilə çap et.
//        int [] numbers = {1, 2, 3, 4, 5};
//        for(int el : numbers){
//            System.out.print(el + " ");
//        }


//4.	Array verilib: [2, 4, 6]
//Tapşırıq: Bütün elementləri topla və çap et.
//        int[] numbers = {2,4,6};
//        int sum  = 0;
//        for(int num : numbers){
//            sum += num;
//        }
//        System.out.println(sum);


//5.	Array verilib: [5, 10, 15, 20]
//Tapşırıq: Arrayin neçə elementdən ibarət olduğunu çap et.
//            int [] array = {5, 10, 15, 20};
//            System.out.println(array.length);

//6.	Array verilib: [3, 7, 9, 12]
//Tapşırıq: İlk və son elementi çap et.
//        int[] arr = {3, 7, 9, 12};
//        System.out.println(arr[0]);
//        System.out.println(arr[arr.length-1]);


//7.	Array verilib: [1, 2, 3]
//Tapşırıq: Hər elementi 2 ilə vur və çap et.
//        int [] arr = {1,2,3};
//        for(int el : arr){
//            System.out.println(el * 2);
//        }


//8.	Array verilib: [1, 2, 3, 4]
//Tapşırıq: Hər ədədin sadə olub olmadığını yoxla və çap et.
        //int[] arr = {1, 2, 3, 4,5,6,7,8,9};
        for(int el = 1; el <= 100; el++){
            boolean  sade = true;
            for(int i = 2; i <= Math.sqrt(el) && sade; i++) {
                if (el % i == 0 && el != i) {
                    sade = false;
                }
            }
            System.out.println(el + " "+((sade) ? "Sade" : "murekkeb"));
        }


//9.	Array verilib: [10, 20, 30]
//Tapşırıq: Arrayin elementlərini tərs sırada çap et: 30, 20, 10.
//
//10.	Array verilib: [1, 2, 3, 4, 5]
//Tapşırıq: Yalnız cüt ədədləri çap et: 2, 4.
//
//
//11.	Array verilib: [5, 7, 9]
//Tapşırıq: Bütün elementləri 0-a bərabər et və çap et.
//
//12.	Array verilib: [8, 3, 5, 1]
//Tapşırıq: Arraydəki ən kiçik ədədi tap və çap et: 1

    }
}

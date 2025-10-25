package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    static void main() {
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("mango");
//        fruits.add("apple");
//        fruits.add("banan");
//        fruits.add("orange");
//        fruits.add("watermelon");
//        printArray(fruits);
//
//        System.out.println(fruits.get(3));
//        if(fruits.contains("banan")) {
//            int indexBanan = fruits.indexOf("banan");
//            fruits.set(indexBanan, "Strawberry");
//        }
//
//        fruits.removeFirst();
//        printArray(fruits);
//        System.out.println(fruits.contains("apple") ? "Tapıldı!" : "Tapılmadı!");
//        fruits.forEach(System.out::println);
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 34, 2, 89, 55));
//        printArray(numbers);
//        findMax(numbers);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 1, 5, 2, 3, 1, 4, 2));
        nums.add(4);
        setUnikal(nums);



    }
    static void printArray(ArrayList<?> list){
        for (Object item : list) System.out.println(item);
    }

    static void findMax(List<Integer> list){
        int max = list.get(0);
        for(Integer i : list){
            if(max < i) max = i;
        }
        System.out.println(max);
    }

    static void setUnikal(ArrayList<Integer> list){
        ArrayList<Integer> unikal = new ArrayList<>();
        for(Integer i : list){
            if (!unikal.contains(i)) unikal.add(i);
        }
        printArray(unikal);
    }

}

//1.	ArrayList<String> yarat, 5 meyvə əlavə et və bütün siyahını çap et.
//2.	Siyahıdakı 3-cü elementi ekrana yazdır.
//3.	Siyahıda "Banana" varsa, onu "Strawberry" ilə əvəz et.
//4.	Siyahının ilk elementini sil və siyahını yenidən çap et.
//5.	Siyahıda "Apple" olub-olmadığını yoxla:
//    o	Varsa: Tapıldı!
//    o	Yoxdursa: Tapılmadı!
//6.	for-each dövrü ilə siyahının bütün elementlərini alt-alta çap et.
//7.	ArrayList<Integer>: 10, 34, 2, 89, 55
//    Ən böyük rəqəmi tap və ekrana çap et.
//8.	ArrayList<Integer>: 5, 1, 5, 2, 3, 1, 4, 2
//    Təkrarlananları sil və yalnız unikal rəqəmləri saxlayan yeni siyahı yarat.


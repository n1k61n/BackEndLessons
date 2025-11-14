package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(abs(-5));
//        System.out.println(abs(0));
//        System.out.println(abs(5));

//        int[] arr1 = {1,2,3};
//        int[] arr2 = {4,5,6,7};
//        System.out.println("Cemi: " + sumArray(arr1, arr2));
//        System.out.println(sumArray2(arr1) + sumArray2(arr2));

//        int a = 0;
//        System.out.println("a = " + a);
//        increseA(a);
//        System.out.println("a = " + a);
//
//        int[] b = {0};
//        System.out.println("b[0] = " + b[0]);
//        increseB(b);
//        System.out.println("b[0] = " + b[0]);
//
//
//        ClassA c = new ClassA(0);
//        System.out.println("c = " + c.getA());
//        c.increaseA();
//        System.out.println("c = " + c.getA());

//        String hello = "hello";
//        System.out.printf("%s HashCode = %s\n", System.identityHashCode(hello) , hello);
//        hello += " world";
//        System.out.printf("%s HashCode = %s\n", System.identityHashCode(hello) , hello);
//
//        StringBuffer hello1 = new StringBuffer("hello");
//        System.out.printf("%s HashCode = %s\n", System.identityHashCode(hello1) , hello1);
//        hello1.append(" world");
//        System.out.printf("%s HashCode = %s\n", System.identityHashCode(hello1) , hello1);

//        Main obj = new Main();
//        System.out.println("Object reference: " + obj); // Calls default Object.toString()
//        System.out.println("Identity Hash Code: " + System.identityHashCode(obj));
//        System.out.println("Hex Identity Hash Code: " + Integer.toHexString(System.identityHashCode(obj)));



    }

    static void increseB(int[] x){
        x[0]++;
    }


    static void increseA(int a){
        a++;
    }

    static int sumArray2(int [] arr){
        if(arr == null || arr.length < 2) return 0;
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 1; i < arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }

    static int sumArray(int[] arr1, int[] arr2){
        int sum = 0;
        int i = 0;
        while(i < arr1.length || i < arr2.length){
            sum += (i < arr1.length) ? arr1[i] : 0;
            sum += (i < arr2.length) ? arr2[i] : 0;
            i++;
        }
        return sum;
    }

    public static int abs(int x){
        return (x > 0) ? -x : x;
    }
}
package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        VolumeCalculator volumeCalculator = new VolumeCalculator();
        System.out.println(volumeCalculator.volume(3));

        AdvancedVolumeCalculator avc = new AdvancedVolumeCalculator();
        System.out.println(avc.volume(3.0));
//        System.out.println(avc.volume(5,3,2));
//        System.out.println(avc.volume(3));


//            List<Product> products = new ArrayList<>();
//            products.add(new FoodProduct("et", 13.9, 10));
//            products.add(new FoodProduct("alma", 3.5, 7));
//            products.add(new FoodProduct("yumurta", 2.4, 5));
//            products.add(new ElectronicProduct("laptor", 1300, 5));
//            products.add(new ElectronicProduct("telefon", 2000, 5));
//            products.add(new ElectronicProduct("televizor", 1000, 5));
//            products.sort(Comparator.comparingDouble(Product::getBasePrice));
//            Product max = Collections.max( products, Comparator.comparingDouble(Product::getBasePrice));
//            System.out.println(max);
//            products.forEach(System.out::println);

        // İki ayrı thread yaradılır
//        MyThread t1 = new MyThread("Thread-1");
//        MyThread t2 = new MyThread("Thread-2");
//        MyThread t3 = new MyThread("Thread-3");
//        MyThread t4 = new MyThread("Thread-4");

        // Thread-lər işə salınır
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        List<MyThread> threads = new ArrayList<>();
//        String thread = "Thread";
//        for(int i = 0 ;i < 10; i++) {
//            threads.add(new MyThread(thread + " " + i));
//        }
//        threads.forEach(myThread -> myThread.start());


// created array with size 3 and assigned values
//        int[] arrNum = new int[3];
//        arrNum[0] = 7;
//        arrNum[1] = 9;
//        arrNum[2] = 11;
//        int[] arrNum2 = new int[5];
//        for (int i = 0; i < arrNum.length; i++) {
//            arrNum2[i] = arrNum[i];
//        }
//        arrNum = arrNum2;
//        arrNum[3] = 3;
//        arrNum[4] = 5;


//        Node head = new Node(0);
//        Node cur = head;
//
//        for(int i = 0; i < 5; i++){
//            cur.next = new Node(i+1);
//            cur = cur.next;
//
//        }
//
//        while(head != null) {
//            System.out.println(head.value);
//            head = head.next;
//        }

//        LinkedList<Product> products = new LinkedList<>();
//        products.add(new Product("telefon", 14.36));
//        products.add(new Product("televizor", 1400));
//        products.add(new Product("diktofon", 20.5));
//        products.add(new Product("mikrofon", 95));
//        products.forEach(product -> System.out.println(product));


//        List<Integer> nums = new ArrayList<>();
//        for(int i = 0; i < 10; i++){
//            nums.add((int) (Math.random() * 100) +1);
//        }
//        Collections.sort(nums);
//
//        System.out.println(nums);
//        System.out.println(Collections.max(nums));

//        List<Order> orders = new ArrayList<>();
//        orders.add(new Order("Emin", OrderStatus.DELIVERED));
//        orders.add(new Order("Orxan", OrderStatus.NEW));
//        orders.add(new Order("Kamran", OrderStatus.SHIPPED));
//        orders.forEach(order -> System.out.println(order));


//        DayOfWeek d = DayOfWeek.getDayOfWeek(2);
//        System.out.println("Day 2 is: " + d);
//        Integer a = 127, b = 127;
//        System.out.println(a==b);



    }
}
package org.example;

import jdk.dynalink.beans.StaticClass;
import org.example.sub.Student;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {
    static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //    Bölmə 4: Casting, Parsing və Conversion
//1. double tipi bir dəyəri int-ə cast edən kod yaz və nəticəni izah et.
//        double a = 12.354444446677;
//        int b  = (int) a;
//        System.out.println(a);
//        System.out.println(b);
//2. String "123" dəyərini int-ə çevirən və onunla 10 əlavə edib nəticəni çap edən proqram yaz.
//        String d = "123";
//        int e = Integer.parseInt(d);
//        System.out.println(e + 10);
//3. int dəyərini String-ə çevirib length() metodundan istifadə edən kod yaz.
//        int a = 12345678;
//        String b = String.valueOf(a);
//        System.out.println(b.length());
//            🔹 Bölmə 5: Arithmetic və Operatorlar
//1. Bir neçə riyazi əməliyyat (+, -, *, /, %) yerinə yetir və nəticələrini çap et.
//        int a = 2;
//        int b = a + 2;
//        int c = b - a;
//        int d = b * c;
//        int e = d / c;
//        System.out.println(e);
//            2. compound assignment operatorlarından (+=, -=, *=) istifadə edən kod nümunəsi yaz.
//
//        int a = 0;
//        a += 1;
//        System.out.println( a);
//        positivNumber(scanner);
//        selectWeekDay(6);
//        sum1to10();
//        printEvenNumbers();
//        checkPassword(scanner);

//        System.out.println(addTwoNumbers(3,4));
//
//        BiConsumer<Integer, Integer> res = (a, b) -> System.out.println(a + b);
//        res.accept(5,7);

//        List cars = new ArrayList();
//        List<String> cars1 = new ArrayList<>();
//
//        ArrayList lst = new ArrayList();
        int a = 5;
        int b = 10;
        System.out.printf("%s ededi %s defiye tapildi\n", a,b);
        System.out.println(a + " ededi" + b +" defiye tapildi");




    }


    static int addTwoNumbers(int a, int b){
        return a + b;
    }


//            🔹 Bölmə 6: Flow Control
//1. İstifadəçidən ədəd al və if-else ilə onun müsbət, mənfi və ya sıfır olduğunu çap et.
    public static void positivNumber(Scanner scaner){
        System.out.print("User input number: ");
        int input = scaner.nextInt();
        if (input > 0){
            System.out.println("Musbet");
        } else if (input < 0) {
            System.out.println("menfi");
        }else
            System.out.println("0 beraberdir");

    }
//2. switch operatoru ilə 1–7 arası ədədlərə uyğun gün adını çap edən proqram yaz.
    public static void selectWeekDay(int i){
        switch (i){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong number");
        }
    }


//3. for dövrü ilə 1-dən 10-a qədər olan ədədlərin cəmini hesabla.
    public static void sum1to10(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("sum of 1 to 10 equals "+sum);
    }
//            4. while dövrü ilə 1-dən 100-ə qədər cüt ədədləri çap et.
    static void printEvenNumbers(){
        int i = 1;
        while(i++ <= 100)  if(i % 2 == 0) System.out.println(i);


    }

//            5. do-while dövrü ilə istifadəçidən parol istəyən və “1234” daxil edilənə qədər təkrarlayan proqram yaz.
    static void checkPassword(Scanner scanner){
        int num ;
        do {
            System.out.print("parol daxil edin:");
            num = scanner.nextInt();
        }while (num != 1234);
    }
}




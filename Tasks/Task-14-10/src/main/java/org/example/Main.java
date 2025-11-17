package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 3, b = 4;
//        for(int i = 0; i< 10; i++){
//            a = a ^ b;
//            System.out.println(a);
//            b = a ^ b;
//            System.out.println(b);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int max = Math.max(Math.max(a, b),c);
//        System.out.println(max);


//        int num = scanner.nextInt();
//        String result  = "";
//        if(num % 5 == 0 && num % 3 == 0) result = "FizzBuzz";
//        else if (num % 5 == 0) result = "Buzz";
//        else if(num % 3 == 0) result = "Fizz";
//        else result = "" + num;
//
//        System.out.println(result);
//
//        int a = 0;
//        int b = 1;
//        for(int i = 0; i < 20; i++){
//            System.out.print(a + " ");
//            int temp = b;
//            b = a + b;
//            a = temp;
//        }

//        fib(10);

//        int a = 5;
//        int b = 7;
//        while (b != 0) {
//            int temp = a % b;
//            a = b;
//            b = temp;
//        }
//        System.out.println(a);


//        int a = 64;
//        int b = 48;
//        while(b != 0){
//            int temp = a % b;
//            a = b;
//            b = temp;
//        }
//        System.out.println(a);
//        System.out.println(gcd(a, b));

        int a = 0;
        int b = 1;
        int i = 0 ;
        while(i < 10){
            System.out.print(a+" ");
            int temp = a + b;
            a  = b;
            b = temp;
            i++;
        }
        System.out.println();
        fib(0, 1, 10);




    }

    static void fib(int a, int b, int n){
        if (n == 0) return;
        System.out.print(a + " ");
        fib(b, a + b, n - 1);

    }

    static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }


}

//I. Əsaslar, Şərtlər və Dövrlər
//1. Dəyişənlərin Dəyişdirilməsi (Swapping):
//int a = 10; və int b = 20; dəyişənlərinin dəyərlərini üçüncü bir dəyişən
// (temp/müvəqqəti dəyişən) istifadə etmədən bir-biri ilə dəyişdirən (swap edən) kodu yazın.

//        2. Böyük Ədədi Tapmaq:
//İstifadəçidən 3 fərqli tam ədəd alın. Bu üç ədədi if-else if-else strukturundan istifadə edərək
// müqayisə edin və ən böyük ədədi tapan kodu yazın.

//        3. Bölünmə Yoxlanışı (FizzBuzz):
//İstifadəçidən bir tam ədəd alın.
//• Əgər ədəd həm 3-ə, həm də 5-ə eyni anda qalıqsız bölünürsə, ekrana "FizzBuzz" çap edin.
//        • Əgər ədəd yalnız 3-ə bölünürsə, ekrana "Fizz" çap edin.
//        • Əgər ədəd yalnız 5-ə bölünürsə, ekrana "Buzz" çap edin.
//        • Heç birinə bölünmürsə, ədədin özünü çap edən kodu yazın.

//        4. Həftə Günləri (Switch Operatoru):
//İstifadəçidən 1-dən 7-yə qədər bir rəqəm alın. switch operatorundan istifadə edərək həmin rəqəmə
// uyğun həftə gününün adını (məsələn, 1 \to "Bazar ertəsi", 7 \to "Bazar") çap edən kodu yazın.

//        5. Fibonaççi Ardıcıllığı:
//İlk iki həddi 0 və 1 olan Fibonaççi ardıcıllığının ilk 10 həddini çap edən kodu yazın.
// Ardıcıllığın hər bir həddi özündən əvvəlki iki həddin cəminə bərabərdir (0, 1, 1, 2, 3, 5, ...).

//        6. Ən Böyük Ümumi Bölən (ƏBÜB - GCD):
//İki tam ədəd daxil edin və while dövrü istifadə edərək bu ədədlərin Ən Böyük Ümumi Bölənini (ƏBÜB)
// tapan kodu yazın. (Məsləhət: Evklid alqoritmini araşdırın).

//II. Massivlər və İkiölçülü Massivlər (Matrislər)
//1. Massivdə Ən Böyük Element:
//        10 elementli tam ədədlər massivi (array) təyin edin (və ya istifadəçidən daxil edin).
//        Massivin içərisindəki ən böyük (maksimum) elementi tapan kodu yazın.
//        2. Massivin Tərsinə Çevrilməsi (In-Place Reverse):
//        6 elementli tam ədədlər massivi yaradın. Bu massivin elementlərini yeni bir massiv yaratmadan,
//        yəni elementlərin yerini dəyişərək, massivi tərsinə çevirən (reverse edən) kodu yazın.
//        (Nümunə: {1, 2, 3, 4, 5, 6} massivi {6, 5, 4, 3, 2, 1} olmalıdır).
//        3. Tək və Cüt Ədədlərin Sayı:
//İstənilən sayda elementdən ibarət olan tam ədəd massivi verilmişdir. Massivdəki tək ədədlərin
// ümumi sayını və cüt ədədlərin ümumi sayını ayrıca hesablayan və nəticəni çap edən kodu yazın.
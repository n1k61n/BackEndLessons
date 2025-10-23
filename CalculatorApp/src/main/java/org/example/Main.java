package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//
//1. Calculator App (Hesablama Sistemi)
//Mövzu: class, object, switch-case, overloading
//Təsvir:
//Calculator sinfi yaradın. İstifadəçi menyudan seçim edir:
//1. Toplama
//2. Çıxma
//3. Vurma
//4. Bölmə
//5. Çıxış
//İstifadəçi iki ədəd daxil edir, switch-case ilə əməliyyat icra olunur.
//Nəticəni Calculator sinfinin calculate() metodu hesablayır.
public class Main {
    public static void main(String[] args) {
        while(true){
            printMenu();
            Scanner sc = new Scanner(System.in);
            Calculator calc = new Calculator();
            double x, y;
            int userInput = sc.nextInt();
            double result;
            switch (userInput){
                case 1:
                    System.out.println("Toplama ucun ededler secin:\n");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    result = calc.calculate(x, y, 1);
                    System.out.printf("%f + %f = %f\n", x, y, result);
                    break;
                case 2:
                    System.out.println("Çıxma ucun ededler secin:\n");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    result = calc.calculate(x, y, 2);
                    System.out.printf("%f - %f = %f\n", x, y, result);
                    break;
                case 3:
                    System.out.println("Vurma ucun ededler secin:\n");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    result = calc.calculate(x, y, 3);
                    System.out.printf("%f * %f = %f\n", x, y, result);
                    break;
                case 4:
                    System.out.println("Bolme ucun ededler secin:\n");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    result = calc.calculate(x, y, 4);
                    System.out.printf("%f / %f = %f\n", x, y, result);
                    break;
                case 5:
                    System.out.println("Çıxış\n");
                    System.exit(0);
                default:
                    System.out.println("Sehv menu secim etmisiniz.");
            }
        }
    }

    static void printMenu(){
        System.out.println("1. Toplama");
        System.out.println("2. Çıxma");
        System.out.println("3. Vurma");
        System.out.println("4. Bölmə");
        System.out.println("5. Çıxış");
    }
}
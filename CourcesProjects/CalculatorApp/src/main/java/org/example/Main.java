package org.example;

import java.util.Scanner;


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
        boolean  exit = true;
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while(exit){
            showMenu();
            double x, y;
            int userInput = sc.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("Toplama ucun ededler secin:\n");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    System.out.printf("%f + %f = %f\n", x, y, calc.calculate(x, y, 1));
                    break;
                case 2:
                    System.out.println("Çıxma ucun ededler secin:\n");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    System.out.printf("%f - %f = %f\n", x, y, calc.calculate(x, y, 2));
                    break;
                case 3:
                    System.out.println("Vurma ucun ededler secin:\n");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    System.out.printf("%f * %f = %f\n", x, y, calc.calculate(x, y, 3));
                    break;
                case 4:
                    System.out.println("Bolme ucun ededler secin:\n");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    System.out.printf("%f / %f = %f\n", x, y, calc.calculate(x, y, 4));
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Sehv menu secim etmisiniz.");
            }
        }
    }

    static void showMenu(){
        String[] lst = {"Toplama", "Çıxma", "Vurma", "Bölmə", "Çıxış"};
        Menu menu = new Menu(lst);
        menu.printMenu();
    }
}
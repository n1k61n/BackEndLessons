package org.example;

//Library Book Tracker – Mini Tapşırıq
//Təsvir:
//Kitabxana sistemi üçün Java proqramı yaradın.
//Tələblər:
//Book sinfi:
//id (int), title (String), isBorrowed (boolean)
//Metodlar: borrowBook(), returnBook(), toString()
//ArrayList<Book> istifadə edərək kitab siyahısı saxlayın.
//Main menyusu switch-case ilə:
//1. Add Book
//2. Show All Books
//3. Borrow Book
//4. Return Book
//5. Exit
//Kitabları siyahıda göstərmək, icarəyə götürmək və qaytarmaq üçün for döngüsü istifadə edin.
//Hər kitabın vəziyyəti göstərilsin: Borrowed və ya Available.
//        📌 OOP prinsipləri: Class, encapsulation, method, object interaction
//📌 Yeni anlayışlar: ArrayList, for döngüsü, switch-case, boolean flag

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Library kitabXanaci = new Library();
        int choice = 5;

        do {
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Seciminizi edin: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> kitabXanaci.addBook(scanner);
                case 2 -> kitabXanaci.showAllBooks();
                case 3 -> kitabXanaci.borrowBook(scanner);
                case 4 -> kitabXanaci.returnBook(scanner);
                case 5 -> System.out.println("Programm baglanir...");
                default -> System.out.println("Secim duzgun edilmeyib....");
            }

        }while(choice != 5);

    }
}

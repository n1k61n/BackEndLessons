package org.example;

/*

. Hotel Reservation System
Mövzu: inheritance, encapsulation, switch-case
Təsvir:
Siniflər:
Room (əsas sinif – roomNumber, price, isBooked)
SingleRoom, DoubleRoom, SuiteRoom (miras alır)
Menyu:
1. Bütün otaqları göstər
2. Otaq rezerv et
3. Rezervi ləğv et
4. Çıxış
Əgər otaq artıq rezerv olunubsa, xəbərdarlıq çıxmalıdır.
        📘 OOP prinsipi: Inheritance, Method overriding
📘 Yeni anlayış: Real-life class design, validation
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        HotelManager manager = new HotelManager();
        int choice;

        do {
            System.out.println("\nHotel Rezervasiya Menyusu:");
            System.out.println("1. Bütün otaqları göstər");
            System.out.println("2. Otaq rezerv et");
            System.out.println("3. Rezervi ləğv et");
            System.out.println("4. Çıxış");
            System.out.print("Seçiminizi daxil edin: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.showAllRooms();
                    break;
                case 2:
                    System.out.print("Rezerv olunacaq otaq nömrəsini daxil edin: ");
                    int bookNum = scanner.nextInt();
                    manager.bookRoom(bookNum);
                    break;
                case 3:
                    System.out.print("Ləğv olunacaq otaq nömrəsini daxil edin: ");
                    int cancelNum = scanner.nextInt();
                    manager.cancelBooking(cancelNum);
                    break;
                case 4:
                    System.out.println("Proqramdan çıxılır...");
                    break;
                default:
                    System.out.println("Yanlış seçim!");
            }
        } while (choice != 4);

        scanner.close();

    }
}

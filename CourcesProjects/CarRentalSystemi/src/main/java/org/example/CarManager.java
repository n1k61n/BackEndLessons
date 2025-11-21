package org.example;

import javax.sql.rowset.CachedRowSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarManager {
    private List<Car> cars = new ArrayList<>();

    /**
     *
     * @param car
     */
    public void addCar(Car car){
        cars.add(car);
    }


    public void showCars(){
        System.out.println("\nMövcud maşınlar:");
        for(Car car : cars){
            if(!car.status) System.out.println(car);
        }
        System.out.println();

    }

    /**
     *
     * @param scanner
     */
    public void rentCar(Scanner scanner){
        System.out.print("Masini secin: ");
        String name = scanner.nextLine();
        for(Car car : cars){
            if(car.brand.equals(name)  && car.status == false){
                car.status = true;
                System.out.println("Masin icareye verildi");
                break;
            }
        }


    }


}

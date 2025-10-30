package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    List<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(String carName){
        cars.removeIf(car -> car.getBrand().equalsIgnoreCase(carName));
    }

    public void showInfo(){
        cars.forEach(System.out::println);
    }
}

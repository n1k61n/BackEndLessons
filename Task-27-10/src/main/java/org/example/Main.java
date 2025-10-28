package org.example;

import org.example.bank.AccountType;
import org.example.bank.Bank;
import org.example.bank.BankAccount;
import org.example.car.Car;
import org.example.car.CarType;
import org.example.employee.Employee;
import org.example.employee.Rank;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//      task 1
//        Bank bank = new Bank();
//        bank.addBankAccount(new BankAccount("EMin", 500, AccountType.SAVINGS));
//        bank.addBankAccount(new BankAccount("Tunar", 1000, AccountType.CHECKING));
//        bank.addBankAccount(new BankAccount("Orxan", 5000, AccountType.FIXED));
//        bank.addDeposit("Emin", 500);
//        bank.withDrawDeposit("Orxan", 1000);
//        bank.showAllBankAccounts();

        //task 2
        List<Employee>  employees = new ArrayList<>();
        employees.add(new Employee("Emin", 500.0, Rank.JUNIOR));
        employees.add(new Employee("Senan", 4000.0, Rank.LEAD));
        employees.add(new Employee("Kenan", 1000.0, Rank.MID));
        employees.add(new Employee("Orxan", 2000.0, Rank.SENIOR));

        employees.forEach(Employee::showInfo);

        //employees.forEach(e -> System.out.println(e.calculateSalary()));

        //task 3
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("Laptop", 1499.99, Category.OTHER ));
//        products.add(new Product("Red Bull", 5.99, Category.DRINK ));
//        products.add(new Product("Gamburger", 14.99, Category.FOOD ));
//        products.add(new Product("Vacuum cleaner", 699.99, Category.CLEANING ));
//        products.add(new Product("Çörək", 0.80, Category.FOOD));
//        products.add(new Product("Süd", 1.20, Category.DRINK));
//        products.add(new Product("Şampun", 3.50, Category.CLEANING));
//        products.add(new Product("Dəftər", 2.00, Category.OTHER));
//        products.add(new Product("Pendir", 2.50, Category.FOOD));
//
//        products.forEach(Product::getInfo);
//        System.out.println();
//        products.forEach(p-> {
//            if(p.getCategory() == Category.FOOD){
//                p.getInfo();
//            }
//        });

        //task 4
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Aysel", 95));
//        students.add(new Student("Murad", 88));
//        students.add(new Student("Leyla", 76));
//        students.add(new Student("Tural", 59));
//        students.add(new Student("Nigar", 82));
//
//
//        students.forEach(Student::showInfo);
//        System.out.println();
//        students.forEach(student -> {
//            if (student.getScore() >= 80) {
//                student.showInfo();
//            }
//        });
        //task5
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Toyota", "Camry", 55.0, CarType.SEDAN));
//        cars.add(new Car("Hyundai", "Tucson", 65.0, CarType.SUV));
//        cars.add(new Car("Ford", "F-150", 80.0, CarType.TRUCK));
//        cars.add(new Car("BMW", "X5", 90.0, CarType.SUV));
//        cars.add(new Car("Mazda", "MX-5", 75.0, CarType.SPORT));
//
//        cars.forEach(Car::showInfo);
//        System.out.println();
//
//
//        for(Car car : cars){
//            if (car.getType() == CarType.SUV){
//                car.showInfo();
//            }
//        }





    }
}


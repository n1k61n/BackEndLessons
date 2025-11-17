package org.example;



public class Main {
    public static void main(String[] args) {
//        Product product = new Product("Laptop", 1499.99, 5);
//        product.showInfo();
        Employee e = new Employee();
        e.setName("Selcan");
        e.setSalary(800);
        e.getInfo();
        e.increaseSalary(10);
        e.getInfo();

    }
}
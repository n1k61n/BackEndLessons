package org.example;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
     public static void main(String[] args) {
        Product product  = new Product();
//        product.setName("Laptop");
//        product.setPrice(1500);
//        product.setStock(5);
//        product.showInfo();
//
//        Student student1 = new Student();
//        student1.setId(100);
//        student1.setName("Helen");
//        student1.setGrade(70);
//        System.out.println("Telebenin adi: " + student1.getName());
//        System.out.println("Telebenin id: " + student1.getId());
//        System.out.println("Telebenin qiymeti: " + student1.getGrade());
//
//        Student student2 = new Student();
//        student2.setId(200);
//        student2.setName("ELi");
//        student2.setGrade(40);
//        System.out.println("Telebenin adi: " + student2.getName());
//        System.out.println("Telebenin id: " + student2.getId());
//        System.out.println("Telebenin qiymeti: " + student2.getGrade());
//
//        Employee e = new Employee();
//        e.setName("Selcan");
//        e.setSalary(700);
//        e.increaseSalary(10);
//        e.getInfo();


    }

    public static boolean validatePin(String pin) {
        // Your code here...
        Pattern pattern =  Pattern.compile(pin);
        Matcher matcher =
        return pattern.matcher(pin);
    }

}





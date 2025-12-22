package org.example;

public class Main {
    static void main(String[] args){
      Student st1 = new Student("Emin", Level.ADVANCED);
      Student st2 = new Student("Emin", Level.ADVANCED);
      System.out.println(st2.equals(st1));
    }
}



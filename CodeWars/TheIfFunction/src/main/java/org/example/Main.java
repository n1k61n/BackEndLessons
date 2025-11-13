package org.example;



public class Main {
    static void main() {

        String hello = "hello";
        System.out.println(hello);
        hello.replace("h", "H");
        System.out.println(hello);

        StringBuffer name = new StringBuffer("emin");
        name.replace(0,1, "E");
        System.out.println(name);


    }
}

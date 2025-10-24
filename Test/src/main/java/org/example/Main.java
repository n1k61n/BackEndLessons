package org.example;

import jdk.dynalink.beans.StaticClass;
import org.example.sub.Student;

public class Main {
    static void main(String[] args) {

        int a = 1;
        a = incA(a);
        System.out.println(a);


    }

    static int incA(int a){
        a++;
        return a;
    }

}

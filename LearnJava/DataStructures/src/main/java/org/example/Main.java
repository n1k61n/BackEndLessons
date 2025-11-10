package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        int choice;
        do{
            System.out.println("1. add to stack");
            System.out.println("2. remove from stack");
            System.out.println("3. show top on the stack");
            System.out.println("4. show all stack");
            System.out.println("5. Exit");
            System.out.print("Select: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> stack.push(scanner);
                case 2 -> stack.pop();
                case 3 -> stack.top();
                case 4 -> stack.showStack();
                case 5 -> System.out.println("Exit..");
                default -> System.out.println("Wrong input...");
            }
        }
        while(choice != 5);
    }
}
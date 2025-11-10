package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {
    private static int topIndex ;
    private final List<Integer> stack ;

    public Stack(){
        topIndex = 0;
        stack = new ArrayList<>();
    }

    public void push(Scanner scanner){
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        stack.add(number);
        topIndex++;
        System.out.println("add to stack");
    }

    public void pop(){
        if(isEmpty()) {
            stack.remove(--topIndex);
            System.out.println("remove from stack");
        }
        else
            System.out.println("stack is empty!");

    }

    public void peek(){
        if (isEmpty())
            System.out.println(stack.get(topIndex-1));
        else
            System.out.println("stack is empty!");
    }

    public void showStack(){
        if(isEmpty()) {
            for (int i = 0; i < size(); i++) {
                System.out.print(stack.get(i) + " ");
            }
            System.out.println();
        }
        else
            System.out.println("stack is empty!");
    }

    public int size(){
        return topIndex;
    }

    public boolean isEmpty(){
        return size() != 0;
    }

}

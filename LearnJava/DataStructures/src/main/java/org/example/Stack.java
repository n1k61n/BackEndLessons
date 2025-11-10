package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {
    private static int topIndex ;
    private List<Integer> stack = new ArrayList<>();

    public void push(Scanner scanner){
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        stack.add(number);
        topIndex++;
        System.out.println("add to stack");
    }

    public void pop(){
        if(!isEmpty()) {
            stack.remove(--topIndex);
            System.out.println("remove from stack");
        }
        else
            System.out.println("stack is empty!");

    }

    public void top(){
        if (!isEmpty())
            System.out.println(stack.get(topIndex-1));
        else
            System.out.println("stack is empty!");
    }

    public void showStack(){
        if(!isEmpty()) {
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.println(stack.get(i));
            }
        }
        else
            System.out.println("stack is empty!");
    }
    public boolean isEmpty(){
        return topIndex == -1;
    }

    public boolean isFull(){
        return topIndex == stack.size() - 1;
    }
}

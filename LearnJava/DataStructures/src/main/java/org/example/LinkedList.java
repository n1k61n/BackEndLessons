package org.example;

public class LinkedList {
    Node head;

    public void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        Node current = head;
        System.out.print("Linked List: ");
        while(current != null){
            System.out.print(current);
            current = current.next;
        }
        System.out.println("null");
    }
}

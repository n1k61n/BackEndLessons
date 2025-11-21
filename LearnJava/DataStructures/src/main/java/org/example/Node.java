package org.example;

public class Node {
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "%s -> ".formatted(value);
    }
}



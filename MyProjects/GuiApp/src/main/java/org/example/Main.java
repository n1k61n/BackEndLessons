package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("New window", 800, 600);
        Button btnOk  = new Button("ok", 100, 30);
        frame.add(btnOk);



        frame.init();
    }
}



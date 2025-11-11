package org.example;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(String title, int width, int height) throws HeadlessException {
        super(title);
        setSize(width, height);
    }

    public void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }


}

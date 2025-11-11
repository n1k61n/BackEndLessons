package org.example;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private int width;
    private int height;


    public Frame(String title, int width, int height) throws HeadlessException {
        super(title);
        this.width = width;
        this.height = height;
    }

    public void init(){
        setBounds(0,0, width, height);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
}

package com.Swing;
import javax.swing.*;

public class FirstGUI
{
    public static void main(String[] args) {
        Abc obj = new Abc();
//        obj.setVisible(true); //obj.show();
//        obj.setSize(400, 400);
    }
}

class Abc extends JFrame
{
    public Abc()
    {
        JLabel l = new JLabel("Hello World");
        add(l);

        setVisible(true); // by default JFrame is not visible when it is created, so setting it true helps it to be visible
        setSize(400, 400); // sets the six=ze of the frame
    }
}


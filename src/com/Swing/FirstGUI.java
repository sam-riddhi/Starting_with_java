package com.Swing;
import javax.swing.*;
import java.awt.*;

public class FirstGUI
{
    public static void main(String[] args) {
        Abc obj = new Abc();
//        obj.setVisible(true); //obj.show();
//        obj.setSize(400, 400);
    }
}

class Abc extends JFrame  //CardLayout - JFrame follows card layout that is like a stack of cards , it only shows the card which is at the top, so when 2 texts are there it shows only l1
    //In order to solve this problem we change the layout by using setLayout
{
    public Abc()
    {

        JLabel l = new JLabel("Hello World");
        JLabel l1 = new JLabel("Welcome Sam");

        add(l);
        add(l1);

        // For every code the below 4 statements are must

        setLayout(new FlowLayout());  //FlowLayout, GridLayout, NullLayout
        setVisible(true); // by default JFrame is not visible when it is created, so setting it true helps it to be visible
        setSize(400, 400); // sets the size of the frame
        //On clicking exit button in the frame it doesn't the prog still runs
        //which means that the exit button is not working properly
        //to make it work properly we use setDefaultCloseOperations
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //The number for exit on close is 3. So instead of writing exit on close we can 3 also
    }
}


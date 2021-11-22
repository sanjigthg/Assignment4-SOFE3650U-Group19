/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Sanjith
 */

public class DisplayApp {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Assignment #4 - Cash Register Application");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400, 400);
          
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter UPC of Product");
        JTextField tf = new JTextField(10);
        JButton display = new JButton("Display");
        panel.add(label);
        panel.add(tf);
        panel.add(display);
        
        JTextArea ta = new JTextArea();
        
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}


    

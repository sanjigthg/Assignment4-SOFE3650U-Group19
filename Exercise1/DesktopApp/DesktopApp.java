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
public class DesktopApp extends JFrame {
    static String appName = CommonUtility.getAppName();
    
    public DesktopApp(){
        super(appName);
        init();
    }
    private void init() {
        setLayout(new FlowLayout());
        add(new JLabel("Welcome to " + appName));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });
    }
}

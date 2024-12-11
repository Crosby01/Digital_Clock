
// Java .awt package contains classes for creating UI
// Javax.swing package(javaExtension) and this provide the abilty to create GUI
package com.mycompany.digitalclock;

import java.awt.FlowLayout; //This class imported from the package is used to arrange components
import java.awt.Font;   //Allows for font specification
import java.awt.Color;  //Set different properties relating to colors

import javax.swing.JFrame;  // For decorations and setting frame
import javax.swing.JLabel;  // Display area for texts or image


public class DigitalClock extends JFrame {      //This extends is used to create a subclass of the class I'm extending
    
    JLabel jlabClock;
    ClockThread ct;
    
    public  DigitalClock() {
        jlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font("San Francisco", Font.CENTER_BASELINE, 65));
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.BLACK);
        jlabClock.setForeground(Color.DARK_GRAY);
        add(jlabClock);
        setSize(1200,120);      //width, then height
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        
        new DigitalClock();
   
    }
}

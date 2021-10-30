package mypackage;

import javax.swing.*;

public class Myframe extends JFrame {
 JRadioButton radiodbutton;
    Myframe(){
     radiodbutton=new JRadioButton();
radiodbutton.setBounds(50,50,50,50);
        this.add(radiodbutton);
        this.setLayout(null);
        this.setTitle("Frame");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}


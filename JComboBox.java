package mypackage;

import javax.swing.*;

public class Myframe extends JFrame {
 JComboBox combo;
    Myframe(){
        String name[]={"Hira","Nimra","kashaf","Ayesha","Saman"};
      combo=new JComboBox(name);
combo.setBounds(40,40,240,50);
        this.add(combo);
        this.setLayout(null);
        this.setTitle("Frame");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

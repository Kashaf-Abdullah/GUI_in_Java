package mypackage;
import javax.swing.*;

public class Myframe extends JFrame {
    JLabel label;
    Myframe(){
        label=new JLabel();
        label.setText("Kashaf Abdullah 20sw027");
        label.setBounds(30,40,240,50);
        this.add(label);
        this.setLayout(null);
        this.setTitle("Frame");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

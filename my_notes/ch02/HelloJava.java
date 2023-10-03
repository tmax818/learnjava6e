package ch02;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloJava {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("This is my JFrame");
        JLabel label = new JLabel("Hello, Java", JLabel.CENTER);
        jFrame.setSize(300, 150);
        jFrame.add(label);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jFrame.setVisible(true);
    }
    
}

package ch04.src;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Encoding {

    public static void main(String[] args) {
        System.out.println("\uD83D\uDE00");
        System.out.println("\uD83D\uDCAF");
        System.out.println("\uD83C\uDF35");
        System.out.println("\u2200");

        String mess = "\uD83D\uDE00";

        JFrame f = new JFrame("Emoji Test");
        f.add(new JLabel(mess));
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
}

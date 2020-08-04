package Frames;

import javax.swing.*;
import java.awt.*;

public class Ovals extends JFrame {
    public Ovals() {
        setTitle("Oval");
        setSize(960,960);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.setColor(Color.darkGray);
        g.fillOval(480,480,100,100);
    }

    public static void main(String[] args) {
        Ovals o = new Ovals();
        o.paint(null);
    }
}
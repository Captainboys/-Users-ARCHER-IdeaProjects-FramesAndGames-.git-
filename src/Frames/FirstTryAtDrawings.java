package Frames;

import javax.swing.*;
import java.awt.*;

public class FirstTryAtDrawings extends JFrame {
    public FirstTryAtDrawings() {
        setTitle("OvalDrawings");
        setSize(960, 960);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(480, 480, 200, 200);
        g.setColor(Color.blue);
        g.fillOval(480,480,175,200);
        g.setColor(Color.CYAN);
        g.fillOval(480,480,150,200);
        g.setColor(Color.GREEN);
        g.fillOval(480,480,125,200);
        g.setColor(Color.GRAY);
        g.fillOval(480,480,100,200);
        g.setColor(Color.WHITE);
        g.fillOval(480,480,75,200);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(480,480,50,200);
        g.setColor(Color.RED);
        g.fillOval(480,480,25,200);
    }

    public static void main(String[] args) {
        FirstTryAtDrawings f = new FirstTryAtDrawings();
        f.paint(null);
    }
}
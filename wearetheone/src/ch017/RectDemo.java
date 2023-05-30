package ch017;

import javax.swing.*;
import java.awt.*;

public class RectDemo extends JFrame {
    RectDemo() {
        setTitle("다양한 사각형 그리기");

        add(new JPanel() {
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);

                graphics.setColor(Color.RED);
                graphics.drawRect(30, 10, 50, 50);
                graphics.drawRoundRect(120, 10, 50, 50, 30, 20);
                graphics.draw3DRect(210, 10, 50, 50, false);
                graphics.draw3DRect(300, 10, 50, 50, true);

                graphics.setColor(Color.GREEN);
                graphics.fillRect(30, 80, 50, 50);
                graphics.fillRoundRect(120, 80, 50, 50, 30, 20);
                graphics.fill3DRect(210, 800, 50, 50, false);
                graphics.fill3DRect(300, 80, 50, 50, true);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RectDemo();
    }
}

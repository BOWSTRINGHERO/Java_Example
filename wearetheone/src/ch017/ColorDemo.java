package ch017;

import javax.swing.*;
import java.awt.*;

public class ColorDemo extends JFrame {
    ColorDemo() {
        setTitle("색상 변환하기");
        JButton button = new JButton("색상 변환");
        add(button);
        button.addActionListener(e -> {
            Color color = new Color((int) (Math.random() * 255.0),
                    (int) (Math.random() * 255.0),
                    (int) (Math.random() * 255.0));
            button.setBackground(color);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorDemo();
    }
}

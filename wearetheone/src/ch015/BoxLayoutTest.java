package ch015;

import javax.swing.*;
import java.awt.*;

// TODO: 2023-05-17 개발자 이현준
public class BoxLayoutTest extends JFrame {
    BoxLayoutTest() {
        setTitle("박스 레이아웃");

        JPanel p = new JPanel();
        BoxLayout boxLayout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(boxLayout);
        for (int i = 1; i <= 5; i++) {
            p.add(new JButton("버튼   " + i));
        }
        add(p, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest();
    }
}

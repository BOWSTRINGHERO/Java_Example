package ch015;

import javax.swing.*;
import java.awt.*;


public class BorderLayoutDemo extends JFrame {
    // TODO: 2023-05-17 개발자 이현준
    BorderLayoutDemo() {
        setTitle("보더 레이아웃!");
        setLayout(new BorderLayout());

        add("east", new JButton("백호"));
        add("west", new JButton("청룡"));
        add("south", new JButton("주작"));
        add(new JButton("현무"), BorderLayout.NORTH);
        add(new JButton("중앙"), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}

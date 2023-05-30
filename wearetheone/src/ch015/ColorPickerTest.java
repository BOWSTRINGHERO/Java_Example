package ch015;

import javax.swing.*;
import java.awt.*;

// TODO: 2023-05-17 개발자 이현준
public class ColorPickerTest extends JFrame {
    ColorPickerTest() {
        setTitle("색상 선택기");
        JComboBox<String> colorpick = new JComboBox<>();
        colorpick.addItem("빨간색");
        colorpick.addItem("초록색");
        colorpick.addItem("파란색");

        JPanel p1 = new JPanel();
        p1.add(colorpick);
        add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        JCheckBox backgroundcolor = new JCheckBox("배경색");
        JCheckBox foregroundcolor = new JCheckBox("전경색");
        p2.add(backgroundcolor);
        p2.add(foregroundcolor);
        add(p2, BorderLayout.CENTER);

        JPanel p3 = new JPanel();
        JButton yes = new JButton("예");
        JButton no = new JButton("아니오");
        p3.add(yes);
        p3.add(no);
        add(p3, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPickerTest();
    }
}

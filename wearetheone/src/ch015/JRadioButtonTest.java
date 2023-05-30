package ch015;

import javax.swing.*;
import java.awt.*;

// TODO: 2023-05-17 개발자 이현준
public class JRadioButtonTest extends JFrame {
    JRadioButtonTest() {
        JRadioButton[] pet = new JRadioButton[3];
        String[] name = {"강아지", "고양이", "금붕어"};
        setTitle("애완 동물");
        ButtonGroup buttonGroup = new ButtonGroup();
        JPanel panel1 = new JPanel();
        for (int i = 0; i < pet.length; i++) {
            pet[i] = new JRadioButton(name[i]);
            buttonGroup.add(pet[i]);
            panel1.add(pet[i]);
        }
        pet[0].setSelected(true);
        add(panel1, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JRadioButtonTest();
    }
}

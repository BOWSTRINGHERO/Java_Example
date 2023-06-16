package summary;

import javax.swing.*;
import java.awt.*;

public class ExComponent02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("텍스트필드 JTextField");
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        frame.add(panel);

        JTextField obj1 = new JTextField(10);
        JTextField obj2 = new JTextField("고양이");
        JTextField obj3 = new JTextField("강아지", 10);

        panel.add(obj1);
        panel.add(obj2);
        panel.add(obj3);

        frame.setVisible(true);
    }
}

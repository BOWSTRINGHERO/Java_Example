package summary;

import javax.swing.*;
import java.awt.*;

public class ExComponent01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("버튼 JButton");
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        frame.add(panel);

        JButton obj1 = new JButton("고양이");
        JButton obj2 = new JButton(new ImageIcon("cat.png"));
        JButton obj3 = new JButton("고양이", new ImageIcon("cat.png"));

//        Panel.add(obj1);
//        Panel.add(obj2);
//        Panel.add(obj3);

        frame.setVisible(true);
    }
}

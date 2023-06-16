package summary;

import javax.swing.*;
import java.awt.*;

public class ExComponent03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("체크 박스 JCheckBox");
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        frame.add(panel);

        JCheckBox obj1 = new JCheckBox();
        JCheckBox obj2 = new JCheckBox("고양이");
        JCheckBox obj3 = new JCheckBox("강아지", true);

        panel.add(obj1);
        panel.add(obj2);
        panel.add(obj3);

        frame.setVisible(true);
    }
}

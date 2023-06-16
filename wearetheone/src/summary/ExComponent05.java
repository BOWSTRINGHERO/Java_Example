package summary;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ExComponent05 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("콤보 박스 JComboBox");
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        frame.add(panel);

        JComboBox obj1 = new JComboBox();

        String name[] = {"고앙이", "강아지", "돼지"};
        JComboBox obj2 = new JComboBox(name);

        Vector vt = new Vector();
        vt.add("고양이");
        vt.add("강아지");
        vt.add("돼지");
        JComboBox obj3 = new JComboBox(vt);

        panel.add(obj1);
        panel.add(obj2);
        panel.add(obj3);

        frame.setVisible(true);
    }
}

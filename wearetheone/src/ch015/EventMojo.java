package ch015;
// TODO: 2023-05-18 개발자 이현준

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventMojo extends JFrame {
    JTextField t1, t2;
    JTextArea area;
    JButton cal, reset;
    JComboBox comboBox;

    EventMojo() {
        setTitle("개발자 이현준");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 220);
        setVisible(true);
    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);

        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);

        KeyListener listener2 = new KeyListener() {
            public void keyTyped(KeyEvent event) {
                System.out.println(event.getKeyChar()+"를 입력했습니다.");
            }

            public void keyReleased(KeyEvent event) {

            }

            public void keyPressed(KeyEvent event) {

            }
        };
        t1.addKeyListener(listener2);
    }

    void showCenter() {
        JPanel panel = new JPanel();

        JTextArea area = new JTextArea();
        area.setText("이 영역에 원의 넓이를 \n계산하는 과정이 나타납니다.");
        area.setEditable(false);
        area.setForeground(Color.RED);

        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        String[] color = {"red", "blue"};

        JPanel panel = new JPanel(new java.awt.FlowLayout(FlowLayout.CENTER, 10, 10));

        cal = new JButton("계산");
        comboBox = new JComboBox<>(color);
        reset = new JButton("리셋");

        panel.add(cal);
        panel.add(comboBox);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);

        ActionListener listener1 = e -> {
            if (e.getSource() == cal) {
                if (t1.getText().isEmpty()) {
                    area.setText("반지름을 입력하세요!!!");
                } else {
                    String s = t1.getText();
                    double radius = Double.parseDouble(s);
                    double result = radius * radius * 3.14;
                    t2.setText("" + result);
                    area.setText(radius + "*" + radius + "*3.14=" + result);
                }
            } else {
                t1.setText("");
                t2.setText("");
                area.setText("");
            }
        };

        cal.addActionListener(listener1);
        reset.addActionListener(listener1);

        comboBox.addItemListener(e -> {
            int index = ((JComboBox) comboBox).getSelectedIndex();
            if (index == 0)
                area.setForeground(Color.RED);
            else
                area.setBackground(Color.BLUE);
        });
    }

    public static void main(String[] args) {
        new EventMojo();
    }
}

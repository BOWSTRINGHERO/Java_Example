package ch016;
// TODO: 2023-05-18 개발자 이현준

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterTest extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JButton b1;

    CounterTest() {
        setTitle("카운터 테스트");

        JPanel p1 = new JPanel();
        label = new JLabel("개수 = 0");
        p1.add(label);
        add("Center", p1);

        JPanel p2 = new JPanel();
        b1 = new JButton("시작");
        b1.addActionListener(this);
        p2.add(b1);
        add("South", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        new Thread(() -> {
            while (true) {
                count++;
                label.setText("count = " + count);
                try {
                    Thread.sleep(500);
                } catch (Exception exception) {
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new CounterTest();
    }
}

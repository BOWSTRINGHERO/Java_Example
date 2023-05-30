package ch016;
// TODO: 2023-05-18 개발자 이현준

import javax.swing.*;

public class AdjustmentListenerDemo extends JFrame {
    AdjustmentListenerDemo() {
        setTitle("스크롤바 손잡이 움직이기");

        JLabel label = new JLabel("", JLabel.CENTER);

        JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL);
//        bar.setValue(50, 10, 0, 100);
        bar.addAdjustmentListener(e -> {
            int v = e.getValue();
            label.setText("위치: " + v);
        });

        JScrollBar bar1 = new JScrollBar(JScrollBar.VERTICAL);

        bar1.addAdjustmentListener(e -> {
            int b = e.getValue();
            label.setText("위치: " + b);
        });

        add("Center", label);
        add("North", bar);
        add("East", bar1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdjustmentListenerDemo();
    }
}

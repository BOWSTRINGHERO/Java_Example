package CH02_03;

import javax.swing.*;

public class JFrame4 extends JFrame {
    JFrame4() {
        setTitle("개발자 이현준");

        JPanel p = new JPanel();
        JLabel l = new JLabel("개발자 이현준");
        JButton b = new JButton("버튼");

        p.add(l);
        p.add(b);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
//        setVisible(true);
        setVisible(false);
    }

    public static void main(String[] args) {
        new JFrame4();
    }
}

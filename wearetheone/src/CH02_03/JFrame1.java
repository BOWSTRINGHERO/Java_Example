package CH02_03;

import javax.swing.*;

//class Myframe extends JFrame {
//    Myframe() {
//        setTitle("개발자 이현준");
//        setSize(500, 500);
//        setVisible(true);
//    }

public class JFrame1 extends JFrame {

    JFrame1() {
        setTitle("개발자 이현준");
//        setSize(500, 500);
//        setVisible(true);

        JButton b = new JButton("버튼");
        add(b);

        setDefaultCloseOperation(JFrame1.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame1();
    }
}
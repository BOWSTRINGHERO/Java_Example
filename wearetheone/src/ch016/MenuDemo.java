package ch016;
// TODO: 2023-05-18 개발자 이현준

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class MenuDemo extends JFrame implements ActionListener {
    MenuDemo() {
        setTitle("메뉴 구성하기"); // 프레임 제목 생성
        makeMenu(); // 메뉴생성
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼 동작 구현
        setSize(300, 170); // 크기 설정
        setVisible(true); // 화면에 표시
    }
    void makeMenu() { // 메뉴생성 메서드
        JMenuItem item;
        KeyStroke keyStroke;

        JMenuBar mb = new JMenuBar(); // 메뉴바 생성
        JMenu m1 = new JMenu("파일");
        m1.setMnemonic(KeyEvent.VK_F); // 단축키 ALT+F 설정
        JMenu m2 = new JMenu("색상");
        m2.setMnemonic(KeyEvent.VK_C); // 단축키 ALT+C 설정

        item = new JMenuItem("새 파일", KeyEvent.VK_N); // 메뉴아이템, 단축키 생성
        item.addActionListener(this); // 이벤트 액션리스너 생성
        m1.add(item); // 메뉴 아이템 추가
        item = new JMenuItem("파일 열기", KeyEvent.VK_O); // 메뉴아이템, 단축키 생성
        item.addActionListener(this); // 이벤트 액션리스너 생성
        m1.add(item); // 메뉴 아이템 추가
        m1.add(new JMenuItem("파일 저장")); // 파일 메뉴에 추가
        m1.addSeparator(); // 구분선 생성
        m1.add(new JMenuItem("종료"));

        item = new JMenuItem("파란색");
        keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK);
        item.setAccelerator(keyStroke);
        item.addActionListener(this);
        m2.add(item);
        item = new JMenuItem("빨간색");
        keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK);
        item.setAccelerator(keyStroke);
        item.addActionListener(this);
        m2.add(item);
        item = new JMenuItem("노란색");
        keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK);
        item.setAccelerator(keyStroke);
        item.addActionListener(this);
        m2.add(item);
        mb.add(m1);
        mb.add(m2);
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }

    public void actionPerformed(ActionEvent event) {
        JMenuItem menuItem = (JMenuItem) (event.getSource());

        switch (menuItem.getText()) {
            case "새 파일" -> System.out.println("새 파일");
            case "파일 열기" -> System.out.println("파일 열기");
            case "파란색" -> getContentPane().setBackground(Color.BLUE);
            case "빨간색" -> getContentPane().setBackground(Color.RED);
            case "노란색" -> getContentPane().setBackground(Color.YELLOW);
        }
    }
}

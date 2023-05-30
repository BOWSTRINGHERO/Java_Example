package ch017;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RepaintDemo extends JFrame {
    Random r = new Random();
    List<Rectangle> list = new ArrayList<>();
    MouseEvent event;

    public RepaintDemo() {
        setTitle("클릭할 때마다 임의의 사각형 그리기");
        add(new MousePanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    class MousePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent event) {
                    if (RepaintDemo.this.event != null) {
                        if (RepaintDemo.this.event.equals(event)) {
                            return;
                        }
                    }

                    int w = r.nextInt(20) + 5;
                    int x = r.nextInt(350);
                    int y = r.nextInt(150);
                    list.add(new Rectangle(x, y, w, w));

                    repaint();

                    RepaintDemo.this.event = event;
                }
            });

            for (int i = 0; i < list.size(); i++) {
                Rectangle rectangle = list.get(i);
                int x = (int) rectangle.getX();
                int y = (int) rectangle.getY();
                int l = (int) rectangle.getWidth();
                graphics.drawRect(x, y, l, l);
            }
        }
    }

    public static void main(String[] args) {
        new RepaintDemo();
    }
}

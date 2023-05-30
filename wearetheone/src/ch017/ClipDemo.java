package ch017;
// TODO: 2023-05-18 개발자 이현준

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ClipDemo extends JFrame {
    ClipDemo() {
        setTitle("이미지 그리기");

        class MyPanel extends JFrame {
        BufferedImage balloons, bear;

        public MyPanel() {
            try {
                balloons = ImageIO.read(new File("images/balloons.png"));
                bear = ImageIO.read(new File("images/bear.png"));
            } catch (IOException e) {
            }
        }

            public void paintComponents(Graphics graphics) {
                super.paintComponents(graphics);

                graphics.setClip(30, 20, 240, 170);

                graphics.drawImage(balloons, 0, 0, null);

                graphics.setColor(Color.RED);

                graphics.drawRect(20, 10, 100, 100);

                graphics.drawImage(bear, 190, 120, null);
            }
        }

        add(new MyPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 265);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClipDemo();
    }
}
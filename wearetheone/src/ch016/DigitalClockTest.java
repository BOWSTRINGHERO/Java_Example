package ch016;

import javax.swing.*;
import java.util.Calendar;

public class DigitalClockTest extends JFrame {
    DigitalClockTest() {
        setTitle("디지털 시계");

        add(new MyLabel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    class MyLabel extends JLabel implements Runnable {
        public MyLabel() {
            setText(getClockText());
            setHorizontalAlignment(JLabel.CENTER);
            new Thread(MyLabel.this).start();
        }

        public String getClockText() {
            Calendar calendar = Calendar.getInstance();
            int h = calendar.get((Calendar.HOUR_OF_DAY));
            int m = calendar.get((Calendar.MINUTE));
            int s = calendar.get((Calendar.SECOND));

            String str = new String(h + ":" + m + ":" + s);

            return str;
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                setText(getClockText());
            }
        }
    }

    public static void main(String[] args) {
        new DigitalClockTest();
    }

}

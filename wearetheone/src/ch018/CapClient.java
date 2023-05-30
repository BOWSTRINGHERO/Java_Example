package ch018;
// TODO: 2023-05-22 개발자 이현준

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CapClient extends JFrame {
    private BufferedReader in;
    private PrintWriter out;
    private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(8, 30);

    public CapClient() {
        setTitle("WATO Client");
        ta.setEditable(false);
        add(tf, "North");
        add(new JScrollPane(ta), "Center");
        tf.addActionListener(e -> {
            out.println(tf.getText());
            String response;
            try {
                response = in.readLine();
                if (response == null || response.equals("")) {
                    System.exit(0);
                }
            } catch (IOException exception) {
                response = "오류 : " + exception;
            }
            ta.append(response + "\n");
            tf.selectAll();
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void run() throws IOException {
        String serverAddress = JOptionPane.showInputDialog(this, "서버의 IP 주소는 ? ", "Welcome WATO Member, 대문자 변환 서버", JOptionPane.QUESTION_MESSAGE);
        Socket client = new Socket(serverAddress, 9000);
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new PrintWriter(client.getOutputStream(), true);
        for (int i = 0; i < 3; i++) {
            ta.append(in.readLine() + "\n");
        }
    }

    public static void main(String[] args) throws Exception {
        new CapClient().run();
    }
}

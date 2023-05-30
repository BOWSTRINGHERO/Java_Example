package ch018;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000);
             Socket connection = serverSocket.accept();
             InputStream inputStream = connection.getInputStream();
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);) {

            String str = (String) objectInputStream.readObject();
            System.out.println("받은 문자열 = " + str);
        } catch (Exception e) {
            System.err.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

package ch013;

import java.io.*;
import java.sql.SQLOutput;

public class StreamReaderDemo {
    public static void main(String[] args) {
        String input = "D:\\Temp\\org.txt";

        try (FileInputStream fi = new FileInputStream(input);
             InputStreamReader in = new InputStreamReader(fi, "US-ASCII")) {
            int c;

            System.out.println(in.getEncoding());

            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {

        }
    }
}

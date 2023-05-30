package CH02_03;

import java.util.Scanner;

public class SRP_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("철수 : ");
        String chulsu = in.next();
        System.out.print("영희 : ");
        String younghui = in.next();

        if (chulsu.equals(younghui))
            System.out.println("무승부");
        else if (chulsu.equals("r")) {
            if (younghui.equals("s"))
                System.out.println("철수 승리");
            else
                System.out.println("영희 승리");
        } else if (chulsu.equals("p")) {
            if (younghui.equals("r"))
                System.out.println("철수 승리");
            else
                System.out.println("영희 승리");
        } else if (chulsu.equals("s")) {
            if (younghui.equals("p"))
                System.out.println("철수 승리");
            else
                System.out.println("영희 승리");
        }
    }
}

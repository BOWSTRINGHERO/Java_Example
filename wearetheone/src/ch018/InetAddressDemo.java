package ch018;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
    public static void main(String[] args) {
        InetAddress address1 = null, address2 = null;
        System.out.print("호스트 이름을 입력하시오 : ");
        Scanner in = new Scanner(System.in);
        String url = in.nextLine();

        try {
            address1 = InetAddress.getByName(url);
            address2 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
        }
        System.out.print(url + "의 IP주소 : ");
        System.out.println(address1.getHostAddress());
        System.out.print("로컬 IP 주소 : ");
        System.out.println(address2.getHostAddress());
    }
}

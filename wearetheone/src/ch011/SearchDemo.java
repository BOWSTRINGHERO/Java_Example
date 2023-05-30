package ch011;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
    public static void main(String[] args) {
        String[] s = {"개발자", "이현준", "3년뒤", "연봉", "1억", "포르쉐"};
        List<String> list = Arrays.asList(s);

        Collections.sort(list);
        System.out.println(list);
        int i = Collections.binarySearch(list, "포르쉐");
        System.out.println(i);
    }
}

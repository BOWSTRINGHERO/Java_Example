package ch012;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDemo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream().limit(4);
//        Map<Nation.Type, List<Nation>> m1 = sn.collect(Collectors.groupingBy(Nation::getType));
        Map<Boolean, List<Nation>> m1 = sn.collect(Collectors.partitioningBy(p -> p.getType() == Nation.Type.LAND));
        System.out.println(m1);

        sn = Nation.nations.stream().limit(4);
//        Map<Nation.Type, Long> m2 = sn.collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));
        Map<Boolean, Long> m2 = sn.collect(Collectors.partitioningBy(p -> p.getType() == Nation.Type.LAND, Collectors.counting()));
        System.out.println(m2);

        sn = Nation.nations.stream().limit(4);
//        Map<Nation.Type, String> m3 = sn.collect(Collectors.groupingBy(Nation::getType, Collectors.mapping(Nation::getName, Collectors.joining("#"))));
        Map<Boolean, String> m3 = sn.collect(Collectors.partitioningBy(p -> p.getType() == Nation.Type.LAND, Collectors.mapping(Nation::getName, Collectors.joining("#"))));
        System.out.println(m3);
    }
}

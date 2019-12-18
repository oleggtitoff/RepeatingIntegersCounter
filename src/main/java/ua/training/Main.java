package ua.training;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList
                = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));

        arrayList.stream()
                .collect(Collectors.groupingBy(
                        Integer::intValue,
                        () -> new TreeMap<>(Comparator.comparingInt(Integer::intValue)),
                        Collectors.counting()
                ))
                .forEach((k, v) -> System.out.println(k + " - " + v));
    }

}

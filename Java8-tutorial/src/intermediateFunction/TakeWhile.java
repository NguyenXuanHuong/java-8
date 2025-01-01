package intermediateFunction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String[] args) {
        List<Integer> list
                = List.of(4, 5, 6, 3, 6, 7, 8, 9, 10);
        Stream<Integer> takeWhileStream = list.stream().takeWhile(number -> number > 3);
        List<Integer> takeWhileList = takeWhileStream.collect(Collectors.toList());
        System.out.println(takeWhileList);
    }
}

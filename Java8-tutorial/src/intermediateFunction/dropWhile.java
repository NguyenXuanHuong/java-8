package intermediateFunction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dropWhile {
    public static void main(String[] args) {
        List<Integer> list
                = List.of(2, 3, 4, 5, 1, 4, 4, 8, 9, 10);
        Stream<Integer> dropWhileStream = list.stream().dropWhile(number -> (number > 1));
        List<Integer> dropWhileList = dropWhileStream.collect(Collectors.toList());
        System.out.println(dropWhileList);
    }
}

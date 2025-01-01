package intermediateFunction;

import java.util.List;
import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> first3ItemsStream = list.stream().limit(3);
        first3ItemsStream.forEach(System.out::println);
    }
}

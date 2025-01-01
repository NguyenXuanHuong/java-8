package intermediateFunction;

import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1,
                i -> i <= 20, i -> i * 2);
        stream.forEach(System.out::println);
    }
}

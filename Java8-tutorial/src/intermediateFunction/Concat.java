package intermediateFunction;

import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2);
        Stream<Integer> stream2 = Stream.of(3,4);
        Stream<Integer> concatStream = Stream.concat(stream1, stream2);
        concatStream.forEach(System.out::println);
    }
}

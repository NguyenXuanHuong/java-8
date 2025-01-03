package intermediateFunction;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class IterateMethod {
    public static void main(String[] args) {
        UnaryOperator<Integer> lambdaToCreateElement = previousInt -> previousInt * 2;
        Predicate<Integer> stopCondition = i -> i <= 20;
        // create a stream using iterate
        Stream<Integer> stream = Stream.iterate(1, stopCondition, lambdaToCreateElement);
        stream.forEach(System.out::println);
    }
}

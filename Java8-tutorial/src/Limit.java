import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
        Stream<Integer> first3ItemsStream = integerStream.limit(3);
        first3ItemsStream.forEach(System.out::println);
    }
}
